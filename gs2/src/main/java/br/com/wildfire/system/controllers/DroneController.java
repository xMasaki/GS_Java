package br.com.wildfire.system.controllers;

import br.com.wildfire.system.entities.Drone;
import br.com.wildfire.system.services.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/drones")
public class DroneController {

    @Autowired
    private DroneService droneService;

    @GetMapping
    public List<Drone> listarDrones() {
        return droneService.listar();
    }

    @GetMapping("/{id}")
    public Drone buscarDrone(@PathVariable int id) {
        return droneService.buscar(id);
    }

    @PostMapping
    public Drone inserirDrone(@RequestBody Drone drone) {
        return droneService.inserir(drone);
    }

    @PutMapping("/{id}")
    public Drone atualizarDrone(@PathVariable int id, @RequestBody Drone drone) {
        return droneService.atualizar(id, drone);
    }

    @DeleteMapping("/{id}")
    public void deletarDrone(@PathVariable int id) {
        droneService.deletar(id);
    }
}
