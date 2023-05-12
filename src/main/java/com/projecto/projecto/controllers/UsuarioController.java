package com.projecto.projecto.controllers;

import com.projecto.projecto.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();
        usuario.setApellido("f");
        usuario.setNombre("a");
        usuario.setEmail("fasdas");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        usuario1.setApellido("f");
        usuario1.setNombre("a");
        usuario1.setEmail("fasdas");
        usuario1.setId(23L);
        Usuario usuario2 = new Usuario();
        usuario2.setApellido("f");
        usuario2.setNombre("a");
        usuario2.setEmail("fasdas");
        usuario2.setId(322l);
        Usuario usuario3 = new Usuario();
        usuario3.setApellido("f");
        usuario3.setNombre("a");
        usuario3.setEmail("fasdas");
        usuario3.setId(333l);

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuarioasdas")
    public Usuario editar(){

        Usuario usuario = new Usuario();
        usuario.setApellido("f");
        usuario.setNombre("a");
        usuario.setEmail("fasdas");
        return usuario;
    }

    @RequestMapping(value = "usuariodasda")
    public Usuario eliminar(){

        Usuario usuario = new Usuario();
        usuario.setApellido("f");
        usuario.setNombre("a");
        usuario.setEmail("fasdas");
        return usuario;
    }

    @RequestMapping(value = "usuarioasdsa")
    public Usuario buscar(){

        Usuario usuario = new Usuario();
        usuario.setApellido("f");
        usuario.setNombre("a");
        usuario.setEmail("fasdas");
        return usuario;
    }

}
