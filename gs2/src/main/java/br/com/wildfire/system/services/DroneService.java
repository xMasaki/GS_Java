package br.com.wildfire.system.services;

import br.com.wildfire.system.entities.Drone;
import br.com.wildfire.system.repositories.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneService {

    @Autowired
    private DroneRepository droneRepository;

    public List<Drone> listar() {
        return droneRepository.findAll();
    }

    public Drone buscar(int id) {
        return droneRepository.findById(id).orElseThrow(()-> new RuntimeException("Drone não encontrado"));
    }

    public Drone inserir(Drone drone) {
        return droneRepository.save(drone);
    }

    public Drone atualizar(int id, Drone droneAtualizado) {
        Drone drone = buscar(id);
        drone.setNomeDrone(droneAtualizado.getNomeDrone());
        drone.setModeloDrone(droneAtualizado.getModeloDrone());
        return droneRepository.save(drone);
    }

    public void deletar(int id) {
        droneRepository.deleteById(id);
    }
}
