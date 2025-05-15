package br.com.ancora.mecanicoapp.controllers;

import br.com.ancora.mecanicoapp.entities.Usuario;
import br.com.ancora.mecanicoapp.repositories.UsuarioRepository;
import br.com.ancora.mecanicoapp.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public void salvarUsuario(@RequestBody @Valid Usuario usuario){
        usuarioService.cadastrarUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Integer id){
        usuarioService.removerUsuario(id);
    }

}
