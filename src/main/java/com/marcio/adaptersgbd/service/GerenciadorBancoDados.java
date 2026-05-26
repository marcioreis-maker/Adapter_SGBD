package com.marcio.adaptersgbd.service;

import com.marcio.adaptersgbd.adapter.FirebirdAdapter;
import com.marcio.adaptersgbd.adapter.MySqlAdapter;
import com.marcio.adaptersgbd.adapter.ParadoxAdapter;
import com.marcio.adaptersgbd.adapter.SgbdAdapter;
import com.marcio.adaptersgbd.perfil.PerfilCliente;

public class GerenciadorBancoDados {

    public void processarOperacao(PerfilCliente perfil, String cliente) {
        SgbdAdapter adapter = selecionarAdapter(perfil);

        System.out.println("\nPerfil: " + perfil.getDescricao());
        System.out.println("SGBD selecionado: " + adapter.getNomeSgbd());
        System.out.println("Tipo de uso: " + adapter.getDescricaoUso());

        adapter.executarOperacao(cliente, "salvar dados da aplicacao");
    }

    private SgbdAdapter selecionarAdapter(PerfilCliente perfil) {
        // O perfil do cliente determina qual SGBD sera usado.
        return switch (perfil) {
            case GRATUITO -> new ParadoxAdapter();
            case BASICO -> new FirebirdAdapter();
            case ULTIMATE -> new MySqlAdapter();
        };
    }
}
