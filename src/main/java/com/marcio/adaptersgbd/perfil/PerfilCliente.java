package com.marcio.adaptersgbd.perfil;

public enum PerfilCliente {

    GRATUITO("Gratuito"),
    BASICO("Basico"),
    ULTIMATE("Ultimate");

    private final String descricao;

    PerfilCliente(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
