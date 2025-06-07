package br.com.wildfire.system.controllers;

import br.com.wildfire.system.entities.Funcionario;
import br.com.wildfire.system.repositories.FuncionarioRepository;
import br.com.wildfire.system.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> listaFuncionarios() {
        return funcionarioService.listar();
    }

    @GetMapping("/{id}")
    public Funcionario buscaFuncionario(@PathVariable Integer id) {
        return funcionarioService.buscar(id);
    }

    @PostMapping
    public Funcionario adicionarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.inserir(funcionario);
    }

    @PutMapping("/{id}")
    public Funcionario atualizarFuncionario(@PathVariable Integer id, @RequestBody Funcionario funcionario) {
        return funcionarioService.atualizar(id, funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletarFuncionario(@PathVariable Integer id) {
        funcionarioService.deletar(id);
    }

}
