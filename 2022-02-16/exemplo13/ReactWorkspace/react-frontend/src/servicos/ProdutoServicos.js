import axios from 'axios'

const USER_REST_API_URL = 'http://localhost:8080/produtos'
class ProdutoServicos{

    getProdutos(){
        return axios.get(USER_REST_API_URL);
    }
}
export default new ProdutoServicos();