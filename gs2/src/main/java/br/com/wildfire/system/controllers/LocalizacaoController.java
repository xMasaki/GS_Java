package br.com.wildfire.system.controllers;

import br.com.wildfire.system.entities.Localizacao;
import br.com.wildfire.system.services.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/localizacoes")
public class LocalizacaoController {

    @Autowired
    private LocalizacaoService localizacaoService;

    @GetMapping
    public List<Localizacao> ListarLocalizacao(){
        return localizacaoService.listar();
    }

    @GetMapping("/{id}")
    public Localizacao BuscarLocalizacao(@PathVariable int id){
        return localizacaoService.buscar(id);
    }

    @PostMapping
    public Localizacao InserirLocalizacao(@RequestBody Localizacao localizacao){
        return localizacaoService.inserir(localizacao);
    }

    @PutMapping("/{id}")
    public Localizacao AtualizarLocalizacao(@PathVariable int id, @RequestBody Localizacao localizacao){
        return localizacaoService.atualizar(id, localizacao);
    }

    @DeleteMapping
    public void DeletarLocalizacao(@PathVariable int id){
        localizacaoService.deletar(id);
    }
}
