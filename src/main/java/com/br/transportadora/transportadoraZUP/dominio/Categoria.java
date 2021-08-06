package com.br.transportadora.transportadoraZUP.dominio;

public enum Categoria {


    A(100), B(200), C(300);

    public int acesso;

    Categoria(int acesso) {
        this.acesso = acesso;
    }

    public int getAcesso(){
        return acesso;
    }

}
