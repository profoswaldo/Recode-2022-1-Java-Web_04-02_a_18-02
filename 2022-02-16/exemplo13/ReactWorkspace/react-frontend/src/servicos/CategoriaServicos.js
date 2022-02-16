import axios from 'axios'

const USER_REST_API_URL = 'http://localhost:8080/categorias'
class CategoriaServicos{

    getCategorias(){
        return axios.get(USER_REST_API_URL);
    }
}
export default new CategoriaServicos();