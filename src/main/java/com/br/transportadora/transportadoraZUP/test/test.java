package com.br.transportadora.transportadoraZUP.test;

import com.br.transportadora.transportadoraZUP.dominio.Cliente;
import com.br.transportadora.transportadoraZUP.dominio.Fornecedor;
import com.br.transportadora.transportadoraZUP.dominio.Pessoa;
import com.br.transportadora.transportadoraZUP.service.ClienteServico;

public class test {

    public static void main(String[] args) {


        Cliente cliente = new Cliente();



        ClienteServico clienteServico = new ClienteServico();

        clienteServico.CadastrarClienteList(cliente);

        clienteServico.listaDeCliente();


    }
}
