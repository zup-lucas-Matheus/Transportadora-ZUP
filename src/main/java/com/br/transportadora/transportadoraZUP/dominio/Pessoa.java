package com.br.transportadora.transportadoraZUP.dominio;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
abstract class Pessoa {
    //Atributos
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String Endereco;


}
