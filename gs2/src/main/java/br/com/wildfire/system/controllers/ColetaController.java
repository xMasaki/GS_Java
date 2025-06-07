package br.com.wildfire.system.controllers;

import br.com.wildfire.system.entities.Coleta;
import br.com.wildfire.system.services.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/coletas")
public class ColetaController {

    @Autowired
    private ColetaService coletaService;

    @GetMapping
    public List<Coleta> listarColetas() {
        return coletaService.listar();
    }

    @GetMapping("/{id}")
    public Coleta buscarColeta(@PathVariable int id) {
        return coletaService.buscarPorId(id);
    }

    @PostMapping
    public Coleta inserirColeta(@RequestBody Coleta coleta) {
        return coletaService.inserir(coleta);
    }

    @DeleteMapping("/{id}")
    public void deletarColeta(@PathVariable int id) {
        coletaService.deletar(id);
    }
}
