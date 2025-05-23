package br.com.ancora.mecanicoapp.services;

import br.com.ancora.mecanicoapp.entities.Compra;
import br.com.ancora.mecanicoapp.repositories.CompraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    // Cadastrar nova compra
    public Compra cadastrarCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    // Listar todas as compras
    public List<Compra> listarCompras() {
        return compraRepository.findAll();
    }

    // Remover uma compra
    public void removerCompra(int id) {
        compraRepository.deleteById(id);
    }

}
