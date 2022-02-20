import React, { Component } from 'react'
import ServicosUsuario from '../services/ServicosUsuario'

class ComponenteListarUsuario extends Component {
    constructor(props) {
        super(props)

        this.state = {
                usuarios: []
        }
        this.addUser = this.addUser.bind(this);
        this.editUser = this.editUser.bind(this);
        this.deleteUser = this.deleteUser.bind(this);
    }

    deleteUser(id){
        ServicosUsuario.deleteUser(id).then( res => {
            this.setState({usuarios: this.state.usuarios.filter(usuario => usuario.id !== id)});
        });
    }
    viewUser(id){
        this.props.history.push(`/view-user/${id}`);
    }
    editUser(id){
        this.props.history.push(`/add-user/${id}`);
    }

  componentDidMount(){
        ServicosUsuario.getUsers().then((res) => {
            if(res.data==null)
            {
                this.props.history.push('/add-user/_add');
            }
            this.setState({ usuarios: res.data});
        });
    }

    addUser(){
        this.props.history.push('/add-user/_add');
    }

    render() {
        return (
            <div>
                 <h2 className="text-center">Usuários Cadastrados</h2>
                 <div className = "row">
                    <button className="btn btn-primary" onClick={this.addUser}> Adicionar Usuário</button>
                 </div>
                 <br></br>
                 <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> Nome</th>
                                    <th> Sobrenome</th>
                                    <th> id Email</th>
                                    <th> Opções</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.usuarios.map(
                                        usuario => 
                                        <tr key = {usuario.id}>
                                             <td> { usuario.firstName} </td>   
                                             <td> {usuario.lastName}</td>
                                             <td> {usuario.idEmail}</td>
                                             <td>
                                                 <button onClick={ () => this.editUser(usuario.id)} className="btn btn-info">Alterar</button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => this.deleteUser(usuario.id)} className="btn btn-danger">Apagar </button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => this.viewUser(usuario.id)} className="btn btn-info">Visualizar </button>
                                             </td>
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table>

                 </div>

            </div>
        )
    }
}

export default ComponenteListarUsuario
