package com.br.transportadora.transportadoraZUP.service;

import com.br.transportadora.transportadoraZUP.dominio.Fornecedor;

import java.util.List;

public class FornecedorServico {

    private List<Fornecedor> fornecedores;
//cadastrar o fornecedor
    public Fornecedor cadastrarFornecedor(Fornecedor fornecedor){
        fornecedores.add(fornecedor);
        return fornecedor;
    }
//exibir fornecedor
    public List<Fornecedor> vizualizarFornecedor(){
        return fornecedores;
    }



    //cadastro do forncedor ok


    //visualização do fornecedor ok

    //CalculoDoOrçamento para o cliente

    //Lista de preço do fornecedor.

}
