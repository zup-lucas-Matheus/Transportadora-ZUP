package com.br.transportadora.transportadoraZUP.dominio;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Frete {

    private String enderecoDeEnvio;
    private String destino;
    private Regiao regiao;
    private Categoria categoria;
    private double distancia;



    public double valorDoFrete(){
        double valorDoFrete = 5;

        return this.distancia * valorDoFrete;

    }
}
