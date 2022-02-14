import React from 'react';
import userservice from '../services/UserServices';
import {Navbar, Nav,Form,FormControl,Button}  from 'react-bootstrap';

class UserComponents extends React.Component{

    constructor(props){
        super(props)
        this.state ={
            users:[]
        }
        
    }

    componentDidMount(){
        userservice.getUsers().then((Response) =>{
            this.setState({users:Response.data})
        });
    }

    render(){
        return(
            <div>
                <Navbar bg="dark" variant="dark">
                   <Navbar.Brand href="#home">Recod Pro</Navbar.Brand>
                    <Nav className="mr-auto">
                        <Nav.Link href="#home">Home</Nav.Link>
                        <Nav.Link href="#features">Spring</Nav.Link>
                        <Nav.Link href="#pricing">React JS</Nav.Link>
                    </Nav>
                    <Form inline>
                        <FormControl type="text" placeholder="Search" className="mr-sm-2" />
                        <Button variant="outline-info">Procurar</Button>
                    </Form>
                </Navbar>
                <h2 className = "text-center">Lista de Alunos</h2>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <th>IDs</th>
                            <th>Nome</th>
                            <th>Sobrenome</th>
                            <th>email</th>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.users.map(
                                user =>
                                <tr key = {user.id}>
                                    <td>{user.id}</td>
                                    <td>{user.firstName}</td>
                                    <td>{user.lastName}</td>
                                    <td>{user.email}</td>
                                </tr>
                            )
                            }
                    </tbody>
                </table>
            </div>
        )
    }
}
export default UserComponents