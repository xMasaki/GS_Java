package br.com.wildfire.system.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "funcionario_gs2")
@Getter
@Setter
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario", nullable = false)
    private int idFuncionario;

    @Column(name = "nome", nullable = false)
    private String nomeFuncionario;

    @Column(name = "funcao", nullable = false)
    private String funcaoFuncionario;

    @Column(name = "cpf", nullable = false)
    private String cpfFuncionario;

    @Column(name = "endereco", nullable = false)
    private String enderecoFuncionario;
}
