package com.br.transportadora.transportadoraZUP.dominio;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@RequiredArgsConstructor
public class Cliente extends Pessoa {

    private String Regiao;
    private String categoria;
    private List<Cliente> cliente;


}
