package br.com.wildfire.system.services;

import br.com.wildfire.system.entities.Funcionario;
import br.com.wildfire.system.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listar() {
        return funcionarioRepository.findAll();
    }

    public Funcionario buscar(int id) {
        return funcionarioRepository.findById(id).orElseThrow(()-> new RuntimeException("Funcionario não encontrado."));
    }

    public Funcionario inserir(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(int id, Funcionario funcionarioAtualizado) {
        Funcionario funcionario = buscar(id);
        funcionario.setNomeFuncionario(funcionarioAtualizado.getNomeFuncionario());
        funcionario.setFuncaoFuncionario(funcionarioAtualizado.getFuncaoFuncionario());
        funcionario.setCpfFuncionario(funcionarioAtualizado.getCpfFuncionario());
        funcionario.setEnderecoFuncionario(funcionarioAtualizado.getEnderecoFuncionario());
        return funcionarioRepository.save(funcionario);
    }

    public void deletar(int id) {
        funcionarioRepository.deleteById(id);
    }

}
