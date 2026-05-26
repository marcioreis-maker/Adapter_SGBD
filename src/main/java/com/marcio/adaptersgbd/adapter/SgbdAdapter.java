package com.marcio.adaptersgbd.adapter;

public interface SgbdAdapter {

    // Interface comum usada pela aplicacao, independente do SGBD real.
    String getNomeSgbd();

    String getDescricaoUso();

    void executarOperacao(String cliente, String operacao);
}
