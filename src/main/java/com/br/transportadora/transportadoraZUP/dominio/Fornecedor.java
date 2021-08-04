package com.br.transportadora.transportadoraZUP.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
public class Fornecedor extends Pessoa{

    private String indentificacao;
    private String numeroDeContrato;
    private String categoria;


}
