import React, { Component } from 'react'
import ServicosUsuario from '../services/ServicosUsuario';

class ComponenteCriarUsuario extends Component {
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id: this.props.match.params.id,
            firstName: '',
            lastName: '',
            idEmail: ''
        }
        this.changeFirstNameHandler = this.changeFirstNameHandler.bind(this);
        this.changeLastNameHandler = this.changeLastNameHandler.bind(this);
        this.saveOrUpdateUser = this.saveOrUpdateUser.bind(this);
    }

    // step 3
    componentDidMount(){

        // step 4
        if(this.state.id === '_add'){
            return
        }else{
            ServicosUsuario.getUserById(this.state.id).then( (res) =>{
                let user = res.data;
                this.setState({firstName: user.firstName,
                    lastName: user.lastName,
                    idEmail : user.idEmail
                });
            });
        }        
    }
    saveOrUpdateUser = (e) => {
        e.preventDefault();
        let user = {firstName: this.state.firstName, lastName: this.state.lastName, idEmail: this.state.idEmail};
        console.log('user => ' + JSON.stringify(user));

        // step 5
        if(this.state.id === '_add'){
            ServicosUsuario.createUser(user).then(res =>{
                this.props.history.push('/users');
            });
        }else{
            ServicosUsuario.updateUser(user, this.state.id).then( res => {
                this.props.history.push('/users');
            });
        }
    }
    
    changeFirstNameHandler= (event) => {
        this.setState({firstName: event.target.value});
    }

    changeLastNameHandler= (event) => {
        this.setState({lastName: event.target.value});
    }

    changeEmailHandler= (event) => {
        this.setState({idEmail: event.target.value});
    }

    cancel(){
        this.props.history.push('/users');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Adicionar Usuário</h3>
        }else{
            return <h3 className="text-center">Alteração de Dados</h3>
        }
    }
    render() {
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            <label> Nome </label>
                                            <input placeholder="Digite o seu nome" name="firstName" className="form-control" 
                                                value={this.state.firstName} onChange={this.changeFirstNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Sobrenome </label>
                                            <input placeholder="Digite o seu sobrenome" name="lastName" className="form-control" 
                                                value={this.state.lastName} onChange={this.changeLastNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> id Email </label>
                                            <input placeholder="Digite o seu Emails" name="idEmail" className="form-control" 
                                                value={this.state.idEmail} onChange={this.changeEmailHandler}/>
                                        </div>

                                        <button className="btn btn-success" onClick={this.saveOrUpdateUser}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancelar</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
        )
    }
}

export default ComponenteCriarUsuario
