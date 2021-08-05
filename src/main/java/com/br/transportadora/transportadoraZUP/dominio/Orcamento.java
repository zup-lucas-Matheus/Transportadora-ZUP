package com.br.transportadora.transportadoraZUP.dominio;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class Orcamento {


    private double distancia;
    private LocalDate dataEntrega;
    private String codigoDeContrato;
    private double valor;


    public double calcularDistancia(){

        return this.distancia * valor;

    }

}
