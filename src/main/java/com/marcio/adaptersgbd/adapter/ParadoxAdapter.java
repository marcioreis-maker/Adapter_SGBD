package com.marcio.adaptersgbd.adapter;

import com.marcio.adaptersgbd.sgbd.ParadoxSgbd;

public class ParadoxAdapter implements SgbdAdapter {

    private final ParadoxSgbd paradox = new ParadoxSgbd();

    @Override
    public String getNomeSgbd() {
        return "Paradox";
    }

    @Override
    public String getDescricaoUso() {
        return "single usuario e banco de dados de transacoes unicas";
    }

    @Override
    public void executarOperacao(String cliente, String operacao) {
        // Adapter: converte a chamada padrao da aplicacao para os metodos do Paradox.
        paradox.abrirBancoLocal();
        paradox.gravarTransacaoUnica(cliente + " - " + operacao);
    }
}
