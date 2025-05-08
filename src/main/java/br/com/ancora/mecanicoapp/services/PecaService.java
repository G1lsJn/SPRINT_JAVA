package br.com.ancora.mecanicoapp.services;

import br.com.ancora.mecanicoapp.entities.Peca;
import br.com.ancora.mecanicoapp.repositories.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PecaService {

    @Autowired
    private PecaRepository pecaRepository;

    public void cadastrarPeca(Peca peca){
        pecaRepository.save(peca);
    }

    public List<Peca> listarPecas(){
        return pecaRepository.findAll();
    }

    public Peca buscarPecaById(int id){
        return pecaRepository.findById(id);
    }

    public Peca buscarPecaByNome(String nome){
        return pecaRepository.findByNome(nome);
    }

    public void removerPeca(int id){
        pecaRepository.deleteById(id);
    }
}
