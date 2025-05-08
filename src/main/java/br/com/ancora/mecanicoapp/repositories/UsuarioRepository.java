package br.com.ancora.mecanicoapp.repositories;

import br.com.ancora.mecanicoapp.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    public Usuario findByNome(String nome);
}
