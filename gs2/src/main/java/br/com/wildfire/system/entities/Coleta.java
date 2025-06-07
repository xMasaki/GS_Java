package br.com.wildfire.system.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.util.Date;

@Entity
@Table(name = "coleta_gs2")
@Getter
@Setter
public class Coleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coleta", nullable = false)
    private int idDrone;

    @Column(name = "densidade", nullable = false)
    private String densidadeColeta;

    @Column(name = "horario", nullable = false)
    private Date horarioColeta;

    @Column(name = "temperatura", nullable = false)
    private float temperaturaColeta;

    @Column(name = "umidade", nullable = false)
    private float umidadeColeta;

    @ManyToOne
    @JoinColumn(name = "id_funcionario", nullable = false)
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_drone", nullable = false)
    private Drone drone;

    @ManyToOne
    @JoinColumn(name = "id_local", nullable = false)
    private Localizacao local;

}
