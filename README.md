# Adapter_SGBD

Aplicacao Spring Boot de console para demonstrar o padrao **Adapter**.

## Cenario

A aplicacao pode ser usada por 3 perfis de clientes:

- Gratuito
- Basico
- Ultimate

Cada perfil utiliza um SGBD diferente:

- Gratuito: Paradox, single usuario e transacoes unicas.
- Basico: Firebird, multi usuario e transacoes unicas.
- Ultimate: MySQL, multi usuario e multiplas transacoes.

## Padrao usado

O padrao usado e o **Adapter**.

A aplicacao trabalha apenas com a interface `SgbdAdapter`. Cada adapter traduz a chamada padrao da aplicacao para a API especifica de cada SGBD.

## Link do repositorio para o PDF

Depois de subir este projeto no GitHub, coloque o link aqui:

`https://github.com/seu-usuario/Adapter_SGBD`

## UML

O diagrama UML esta no arquivo [UML.md](UML.md).
