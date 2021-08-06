package com.br.transportadora.transportadoraZUP.dominio;

import lombok.Data;

public enum Categoria {


    A("Lucas"), B("Cesar"), C("Guilherme");

    public String motorista;


    Categoria(String motorista) {
        this.motorista = motorista;
    }

    public String CatA;
    public String CatB;
    public String CatC;


    Categoria(String motorista, String catA, String catB, String catC) {
        this.motorista = motorista;
        CatA = catA;
        CatB = catB;
        CatC = catC;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getCatA() {
        return CatA;
    }

    public void setCatA(String catA) {
        CatA = catA;
    }

    public String getCatB() {
        return CatB;
    }

    public void setCatB(String catB) {
        CatB = catB;
    }

    public String getCatC() {
        return CatC;
    }

    public void setCatC(String catC) {
        CatC = catC;
    }
}
