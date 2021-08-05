package com.br.transportadora.transportadoraZUP.dominio;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class Orcamento {


    private BigDecimal distancia;
    private LocalDate dataEntrega;
    private String codigoDeContrato;



    public void calcularDistancia(){



    }

}
