package br.com.ancora.mecanicoapp.repositories;

import br.com.ancora.mecanicoapp.entities.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra,Integer> {

    public Compra findById(int id);

}
