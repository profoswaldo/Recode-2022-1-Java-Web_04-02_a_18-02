import React from 'react';

import ProdutoServicos from '../servicos/ProdutoServicos';

class ProdutoComponente extends React.Component{

    constructor(props){
        super(props)
        this.state ={
            produtos:[]
        }
        
    }
    componentDidMount(){
        ProdutoServicos.getProdutos().then((Response) =>{
            this.setState({produtos:Response.data})
        });
    }
    render(){
        return(
            <div>
                <h1 className = "text-center">Produtos</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <th>IDs</th>
                            <th>Nome</th>
                            <th>Preço</th>
                            <th>Categoria ID</th>
                            <th>Nome Categoria</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.produtos.map(
                                produto =>
                                <tr key = {produto.id}>
                                    <td>{produto.id}</td>
                                    <td>{produto.name}</td>
                                    <td>{produto.price}</td>
                                    <td>{produto.categoria.id}</td>
                                    <td>{produto.categoria.name}</td>
                                </tr>
                            )
                            }
                    </tbody>
                </table>
            </div>
        )
    }
}
export default ProdutoComponente