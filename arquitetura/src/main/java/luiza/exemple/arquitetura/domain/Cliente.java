package luiza.exemple.arquitetura.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Cliente {

    private Integer codigo;

    private String nome;
}
