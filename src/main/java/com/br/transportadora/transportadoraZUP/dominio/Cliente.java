package com.br.transportadora.transportadoraZUP.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@RequiredArgsConstructor
public class Cliente {
    private Pessoa cliente;
    private double distancia;
    private List<Orcamento> orcamentos = new ArrayList<>();

    public double getDistancia() {
        return distancia;
    }
}
