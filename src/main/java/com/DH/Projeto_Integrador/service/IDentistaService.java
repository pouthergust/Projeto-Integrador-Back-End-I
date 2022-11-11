package com.DH.Projeto_Integrador.service;

import com.DH.Projeto_Integrador.model.Dentista;

import java.util.List;

public interface IDentistaService {
    void cadastrarDentista();
    List<Dentista> listDentistas();
    void excluirDentista(Dentista dentista);
}
