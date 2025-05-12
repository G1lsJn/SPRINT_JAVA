package br.com.ancora.mecanicoapp.controllers;

import br.com.ancora.mecanicoapp.entities.Compra;
import br.com.ancora.mecanicoapp.entities.Peca;
import br.com.ancora.mecanicoapp.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public void adicionarCompra(@RequestBody Compra compra) {
        compraService.cadastrarCompra(compra);
    }

    @GetMapping
    public List<Compra> listarCompras(){
        return compraService.listarCompras();
    }


}
