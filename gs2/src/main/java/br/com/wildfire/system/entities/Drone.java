package br.com.wildfire.system.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "drone_gs2")
@Getter
@Setter
public class Drone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_drone", nullable = false)
    private int idDrone;

    @Column(name = "nome", nullable = false)
    private String nomeDrone;

    @Column(name = "modelo", nullable = false)
    private String modeloDrone;

}
