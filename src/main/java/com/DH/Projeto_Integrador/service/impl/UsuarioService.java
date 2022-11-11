package com.DH.Projeto_Integrador.service.impl;

import com.DH.Projeto_Integrador.model.Usuario;
import com.DH.Projeto_Integrador.service.IUsuarioService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsuarioService implements IUsuarioService {

    @Override
    public List<Usuario> usuarioList() {
        return Arrays.asList(new Usuario("João Victor", "Jvrossi10@gmail.com", "123A45b6C", 1, 1), new Usuario("Gabriel Henrique", "GabrielHenique@gmail.com","456ASD789", 3, 2), new Usuario("Diogo de Moraes", "Diogo@Gmail.com", "78as5d4", 2, 3));
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarioList().add(usuario);
    }

    @Override
    public void excluirUsuario(Usuario usuario) {
        usuarioList().remove(usuario.getId());
    }

}
