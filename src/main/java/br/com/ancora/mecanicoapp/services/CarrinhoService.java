package br.com.ancora.mecanicoapp.services;

import br.com.ancora.mecanicoapp.entities.Carrinho;
import br.com.ancora.mecanicoapp.repositories.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho adicionarAoCarrinho(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public List<Carrinho> findAll(){
        return carrinhoRepository.findAll();
    }

}
