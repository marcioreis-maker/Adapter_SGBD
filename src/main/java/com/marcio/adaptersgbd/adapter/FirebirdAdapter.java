package com.marcio.adaptersgbd.adapter;

import com.marcio.adaptersgbd.sgbd.FirebirdSgbd;

public class FirebirdAdapter implements SgbdAdapter {

    private final FirebirdSgbd firebird = new FirebirdSgbd();

    @Override
    public String getNomeSgbd() {
        return "Firebird";
    }

    @Override
    public String getDescricaoUso() {
        return "multi usuario e banco de dados de transacoes unicas";
    }

    @Override
    public void executarOperacao(String cliente, String operacao) {
        // Adapter: converte a chamada padrao da aplicacao para os metodos do Firebird.
        firebird.conectarServidorMultiUsuario();
        firebird.executarTransacaoUnica(cliente + " - " + operacao);
    }
}
