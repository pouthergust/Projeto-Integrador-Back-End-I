package com.DH.Projeto_Integrador.service.impl;

import com.DH.Projeto_Integrador.model.Dentista;
import com.DH.Projeto_Integrador.service.IDentistaService;

import java.util.List;

public class DentistaServiceImpl implements IDentistaService {
    @Override
    void cadastrarDentista() {

    }

    @Override
    List<Dentista> listDentistas() {
        return null;
    }

    @Override
    void excluirDentista() {
        listDentistas().remove(dentista.getId());
    }
}
