package br.com.ancora.mecanicoapp.controllers;

import br.com.ancora.mecanicoapp.entities.Peca;
import br.com.ancora.mecanicoapp.services.PecaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/v1/pecas")
public class PecaController {

    @Autowired
    private PecaService pecaService;

    @PostMapping
    public void salvarPeca(@RequestBody @Valid Peca peca){
        pecaService.cadastrarPeca(peca);
    }

    @GetMapping
    public List<Peca> listarPecas(){
        return pecaService.listarPecas();
    }

    @DeleteMapping("/{id}")
    public void deletarPeca(@PathVariable Integer id){
        pecaService.removerPeca(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Peca> atualizarPeca(@PathVariable Integer id, @RequestBody Peca novaPeca) {
        Peca pecaAtualizada = pecaService.atualizarPeca(id, novaPeca);
        return ResponseEntity.ok(pecaAtualizada);
    }
}
