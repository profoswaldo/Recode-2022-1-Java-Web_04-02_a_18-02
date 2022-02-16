import React from 'react';

import CategoriaServicos from '../servicos/CategoriaServicos';

import {Navbar, Nav,Form,FormControl,Button}  from 'react-bootstrap';

class CategoriaComponente extends React.Component{

    constructor(props){
        super(props)
        this.state ={
            categorias:[]
        }
        
    }
    componentDidMount(){
        CategoriaServicos.getCategorias().then((Response) =>{
            this.setState({categorias:Response.data})
        });
    }
    render(){
        return(
            <div>
                <h1 className = "text-center">Categorias</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <th>IDs</th>
                            <th>Nome</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.categorias.map(
                                categoria =>
                                <tr key = {categoria.id}>
                                    <td>{categoria.id}</td>
                                    <td>{categoria.name}</td>
                                </tr>
                            )
                            }
                    </tbody>
                </table>
            </div>
        )
    }
}
export default CategoriaComponente