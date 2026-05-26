package com.marcio.adaptersgbd;

import com.marcio.adaptersgbd.perfil.PerfilCliente;
import com.marcio.adaptersgbd.service.GerenciadorBancoDados;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterSgbdApplication {

    public static void main(String[] args) {
        GerenciadorBancoDados gerenciador = new GerenciadorBancoDados();

        // Demonstra os tres perfis pedidos no enunciado.
        gerenciador.processarOperacao(PerfilCliente.GRATUITO, "Cliente Gratuito");
        gerenciador.processarOperacao(PerfilCliente.BASICO, "Cliente Basico");
        gerenciador.processarOperacao(PerfilCliente.ULTIMATE, "Cliente Ultimate");
    }
}
