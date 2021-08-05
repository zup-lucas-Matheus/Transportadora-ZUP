package com.br.transportadora.transportadoraZUP.dominio;

public enum Categoria {
    Valor(100,250,500);

    public int CatA;
    public int CatB;
    public int CatC;




    Categoria(int catA,int catB,int catC) {
        CatA = catA;
        CatB = catB;
        CatC = catC;
    }

    public int getCatA() {
        return CatA;
    }

    public int getCatB() {
        return CatB;
    }

    public int getCatC() {
        return CatC;
    }
}
