import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import {Button, Container, ButtonGroup, Table} from 'reactstrap';
import AppNavBar from './AppNavBar';

class ListarClientes extends Component {

    constructor(props) {
        super(props);
        this.state = {
            clientes: []
        };
        this.remove = this.remove.bind(this);
    }

    componentDidMount() {
        fetch('/clientes')
            .then(response => response.json())
            .then(data => this.setState({clientes: data}));
    }

    async remove(id) {
        await fetch(`/clientes/${id}`, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        }).then(() => {
            let updatedClients = [...this.state.clientes].filter(i => i.id !== id);
            this.setState({clientes: updatedClients});
        });
    }

    render() {
        const {clientes, isLoading} = this.state;

        if (isLoading) {
            return <p>Carregando...</p>;
        }

        const clientList = clientes.map(cliente => {
            return <tr key={cliente.id}>
                <td style={{whiteSpace: 'nowrap'}}>{cliente.name}</td>
                <td>{cliente.email}</td>
                <td>
                    <ButtonGroup>
                        <Button size="sm" color="primary" tag={Link} to={"/clientes/" + cliente.id}>Alterar</Button>
                        <Button size="sm" color="danger" onClick={() => this.remove(cliente.id)}>Apagar</Button>
                    </ButtonGroup>
                </td>
            </tr>
        });

        return (
            <div>
                <AppNavBar/>
                <Container fluid>
                    <div className="float-right">
                        <Button color="success" tag={Link} to="/clientes/new">Incluir Cliente</Button>
                    </div>
                    <h3>Clientes</h3>
                    <Table className="mt-4">
                        <thead>
                        <tr>
                            <th width="30%">Nome</th>
                            <th width="30%">E-mail</th>
                            <th width="40%">Opções</th>
                        </tr>
                        </thead>
                        <tbody>
                        {clientList}
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}

export default ListarClientes;