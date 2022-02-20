import React, { Component } from 'react'
import ServicosUsuario from '../services/ServicosUsuario'

class ComponenteVisualizarUsuario extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            usuario: {}
        }
    }

    componentDidMount(){
        ServicosUsuario.getUserById(this.state.id).then( res => {
            this.setState({usuario: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> Dados do Usuário</h3>
                    <div className = "card-body">
                        <div className = "row">
                            <label> Nome: </label>
                            <div> { this.state.usuario.firstName }</div>
                        </div>
                        <div className = "row">
                            <label> Sobrenome: </label>
                            <div> { this.state.usuario.lastName }</div>
                        </div>
                        <div className = "row">
                            <label> Email: </label>
                            <div> { this.state.usuario.idEmail }</div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}

export default ComponenteVisualizarUsuario
