package br.com.ancora.mecanicoapp.services;

import br.com.ancora.mecanicoapp.entities.Usuario;
import br.com.ancora.mecanicoapp.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void cadastrarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void removerUsuario(Usuario usuario){
        usuarioRepository.delete(usuario);
    }

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }
}
