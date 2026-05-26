package com.marcio.adaptersgbd.sgbd;

public class ParadoxSgbd {

    public void abrirBancoLocal() {
        System.out.println("[Paradox] Banco local aberto para single usuario.");
    }

    public void gravarTransacaoUnica(String dados) {
        System.out.println("[Paradox] Gravando transacao unica: " + dados);
    }
}
