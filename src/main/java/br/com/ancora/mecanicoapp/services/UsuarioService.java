package br.com.ancora.mecanicoapp.services;

import br.com.ancora.mecanicoapp.entities.Usuario;
import br.com.ancora.mecanicoapp.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // CADASTRAR USUÁRIO
    public void cadastrarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    // APAGAR USUÁRIO
    public void removerUsuario(int id){
        usuarioRepository.deleteById(id);
    }

    // LISTAR USUÁRIO
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }
}
