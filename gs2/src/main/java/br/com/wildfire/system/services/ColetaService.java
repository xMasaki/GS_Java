package br.com.wildfire.system.services;

import br.com.wildfire.system.entities.Coleta;
import br.com.wildfire.system.repositories.ColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColetaService {

    @Autowired
    private ColetaRepository coletaRepository;

    public List<Coleta> listar() {
        return coletaRepository.findAll();
    }

    public Coleta buscarPorId(int id) {
        return coletaRepository.findById(id).orElseThrow(()-> new RuntimeException("Coleta não encontrada"));
    }

    public Coleta inserir(Coleta coleta) {
        if (coleta.getUmidadeColeta() < 20) {
            System.out.println("Alerta!! Umidade em " + coleta.getUmidadeColeta() + "%!!");
        }
        if (coleta.getTemperaturaColeta() > 35) {
            System.out.println("Alerta!! Temperatura em " + coleta.getTemperaturaColeta() + " graus!!");
        }
        return coletaRepository.save(coleta);
    }

    public void deletar(int id) {
        coletaRepository.deleteById(id);
    }
}
