package br.com.ancora.mecanicoapp.controllers;

import br.com.ancora.mecanicoapp.entities.Peca;
import br.com.ancora.mecanicoapp.services.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/pecas")
public class PecaController {

    @Autowired
    private PecaService pecaService;

    @PostMapping
    public void salvarPeca(@RequestBody Peca peca){
        pecaService.cadastrarPeca(peca);
    }

    @GetMapping
    public List<Peca> listarPecas(){
        return pecaService.listarPecas();
    }
}
