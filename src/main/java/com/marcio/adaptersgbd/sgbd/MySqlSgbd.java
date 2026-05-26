package com.marcio.adaptersgbd.sgbd;

public class MySqlSgbd {

    public void abrirConexaoMultiUsuario() {
        System.out.println("[MySQL] Conexao aberta para multi usuario.");
    }

    public void iniciarTransacao() {
        System.out.println("[MySQL] Iniciando transacao.");
    }

    public void executarComando(String dados) {
        System.out.println("[MySQL] Executando comando: " + dados);
    }

    public void confirmarTransacao() {
        System.out.println("[MySQL] Confirmando transacao.");
    }
}
