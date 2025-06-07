package br.com.wildfire.system.services;

import br.com.wildfire.system.entities.Localizacao;
import br.com.wildfire.system.repositories.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    public List<Localizacao> listar(){
        return localizacaoRepository.findAll();
    }

    public Localizacao buscar(int id){
        return localizacaoRepository.findById(id).orElseThrow(()-> new RuntimeException("Localização não encontrada."));
    }

    public Localizacao inserir(Localizacao localizacao){
        return localizacaoRepository.save(localizacao);
    }

    public Localizacao atualizar(int id, Localizacao localizacaoAtualizada){
        Localizacao localizacao = buscar(id);
        localizacao.setLatitude(localizacaoAtualizada.getLatitude());
        localizacao.setLongitude(localizacaoAtualizada.getLongitude());
        localizacao.setAltitude(localizacaoAtualizada.getAltitude());
        return localizacaoRepository.save(localizacao);
    }

    public void deletar(int id){
        localizacaoRepository.deleteById(id);
    }


}
