package com.marcio.adaptersgbd.sgbd;

public class FirebirdSgbd {

    public void conectarServidorMultiUsuario() {
        System.out.println("[Firebird] Servidor conectado para multi usuario.");
    }

    public void executarTransacaoUnica(String dados) {
        System.out.println("[Firebird] Executando transacao unica: " + dados);
    }
}
