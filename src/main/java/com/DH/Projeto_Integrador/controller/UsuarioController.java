package com.DH.Projeto_Integrador.controller;

import com.DH.Projeto_Integrador.model.Usuario;
import com.DH.Projeto_Integrador.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UsuarioController {


    private final IUsuarioService usuarioService;


    @Autowired
    public UsuarioController(IUsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> getUsuario(){
        return usuarioService.usuarioList();
    }

}
