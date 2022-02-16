package recolde.controles;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import recolde.modelos.Cliente;
import recolde.persistencia.DaoCliente;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ControleCliente {

    private final DaoCliente dao;

    public ControleCliente(DaoCliente dao) {
        this.dao = dao;
    }

    @GetMapping
    public List<Cliente> getClientes() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id) {
        return dao.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity createCliente(@RequestBody Cliente client) throws URISyntaxException {
        Cliente savedClient = dao.save(client);
        return ResponseEntity.created(new URI("/clients/" + savedClient.getId())).body(savedClient);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCliente(@PathVariable Long id, @RequestBody Cliente client) {
        Cliente currentClient = dao.findById(id).orElseThrow(RuntimeException::new);
        currentClient.setName(client.getName());
        currentClient.setEmail(client.getEmail());
        currentClient = dao.save(client);

        return ResponseEntity.ok(currentClient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCliente(@PathVariable Long id) {
        dao.deleteById(id);
        return ResponseEntity.ok().build();
    }
}