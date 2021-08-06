package com.br.transportadora.transportadoraZUP.dominio;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class Orcamento {


    private Regiao regiao;
    private Categoria categoria;
    private LocalDate dataEntrega;
    private String codigoDeContrato;
    private Frete frete;
}
