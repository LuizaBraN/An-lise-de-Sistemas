package luiza.exemple.arquitetura.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import luiza.exemple.arquitetura.domain.Cliente;

@Repository

public class ClienteRepository {

    public List<Cliente> clientes;

    /**
     * 
     */
    public  ClienteRepository() {
        clientes = new ArrayList<>();
        Cliente senna = Cliente.builder()
                               .codigo(1)
                               .nome("Ayrton Senna")
                               .build();

      

        clientes.add(senna);

                                
    }

    public List<Cliente> findALL() {
        return clientes;
    }

}
