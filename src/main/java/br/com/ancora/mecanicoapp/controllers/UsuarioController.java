package br.com.ancora.mecanicoapp.controllers;

import br.com.ancora.mecanicoapp.entities.Usuario;
import br.com.ancora.mecanicoapp.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public void salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.cadastrarUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }

}
