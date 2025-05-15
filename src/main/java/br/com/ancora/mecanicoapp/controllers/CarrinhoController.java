package br.com.ancora.mecanicoapp.controllers;

import br.com.ancora.mecanicoapp.entities.Carrinho;
import br.com.ancora.mecanicoapp.services.CarrinhoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/v1/carrinhos")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping
    public void adicionarCarrinho(@RequestBody @Valid Carrinho carrinho) {
        carrinhoService.adicionarAoCarrinho(carrinho);
    }

    @GetMapping
    public List<Carrinho> listarCarrinho(){
        return carrinhoService.findAll();
    }
}
