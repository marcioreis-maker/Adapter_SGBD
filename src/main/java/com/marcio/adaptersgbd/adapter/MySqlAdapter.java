package com.marcio.adaptersgbd.adapter;

import com.marcio.adaptersgbd.sgbd.MySqlSgbd;

public class MySqlAdapter implements SgbdAdapter {

    private final MySqlSgbd mySql = new MySqlSgbd();

    @Override
    public String getNomeSgbd() {
        return "MySQL";
    }

    @Override
    public String getDescricaoUso() {
        return "multi usuario e banco de dados com multiplas transacoes";
    }

    @Override
    public void executarOperacao(String cliente, String operacao) {
        // Adapter: converte a chamada padrao da aplicacao para os metodos do MySQL.
        mySql.abrirConexaoMultiUsuario();
        mySql.iniciarTransacao();
        mySql.executarComando(cliente + " - " + operacao);
        mySql.confirmarTransacao();
    }
}
