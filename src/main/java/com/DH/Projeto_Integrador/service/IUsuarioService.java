package com.DH.Projeto_Integrador.service;

import com.DH.Projeto_Integrador.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> usuarioList();

    public void adicionarUsuario(Usuario usuario);

    public void excluirUsuario(Usuario usuario);

}
