import React, { Component } from 'react'
import ServicosUsuario from '../services/ServicosUsuario';

class ComponenteAtualizarUsuario extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            firstName: '',
            lastName: '',
            idEmail: ''
        }
        this.changeFirstNameHandler = this.changeFirstNameHandler.bind(this);
        this.changeLastNameHandler = this.changeLastNameHandler.bind(this);
        this.updateUser = this.updateUser.bind(this);
    }

    componentDidMount(){
        ServicosUsuario.getUserById(this.state.id).then( (res) =>{
            let user = res.data;
            this.setState({firstName: user.firstName,
                lastName: user.lastName,
                idEmail : user.idEmail
            });
        });
    }

    updateUser = (e) => {
        e.preventDefault();
        let user = {firstName: this.state.firstName, lastName: this.state.lastName, idEmail: this.state.idEmail};
        console.log('user => ' + JSON.stringify(user));
        console.log('id => ' + JSON.stringify(this.state.id));
        ServicosUsuario.updateUser(user, this.state.id).then( res => {
            this.props.history.push('/users');
        });
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

    render() {
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                <h3 className="text-center">Alteração de Dados</h3>
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

                                        <button className="btn btn-success" onClick={this.updateUser}>Save</button>
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

export default ComponenteAtualizarUsuario
