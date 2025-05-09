package luiza.exemple.arquitetura.control;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import luiza.exemple.arquitetura.domain.Cliente;
import luiza.exemple.arquitetura.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")

public class ClienteControl {

    private final ClienteRepository repository;

    public ClienteControl(ClienteRepository repository){
        this.repository = repository;
    }
    
    public List<Cliente> listarTodos() {
        return repository.findALL();
    }
    
}


