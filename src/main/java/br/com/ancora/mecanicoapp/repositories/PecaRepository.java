package br.com.ancora.mecanicoapp.repositories;

import br.com.ancora.mecanicoapp.entities.Peca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PecaRepository extends JpaRepository<Peca, Integer> {

    public Peca findByNome(String nome);

    public Peca findById(int id);

}
