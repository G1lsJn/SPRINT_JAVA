package br.com.ancora.mecanicoapp.controllers;

import br.com.ancora.mecanicoapp.entities.Compra;
import br.com.ancora.mecanicoapp.services.CompraService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/v1/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public void adicionarCompra(@RequestBody @Valid Compra compra) {
        compraService.cadastrarCompra(compra);
    }

    @GetMapping
    public List<Compra> listarCompras(){
        return compraService.listarCompras();
    }

    @DeleteMapping("/{id}")
    public void deletarCompra(@PathVariable Integer id){
        compraService.removerCompra(id);
    }

}
