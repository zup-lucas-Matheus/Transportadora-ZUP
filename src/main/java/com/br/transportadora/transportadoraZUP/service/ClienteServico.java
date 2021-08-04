package com.br.transportadora.transportadoraZUP.service;

import com.br.transportadora.transportadoraZUP.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteServico {


    //cadastrarCliente

    public List <Cliente>clienteList = new ArrayList<>();

    public Cliente CadastrarClienteList(Cliente cliente){
          verificarExiste(cliente);
        clienteList.add(cliente);
        return cliente;
    }



    // verificar se existe
    public void verificarExiste(Cliente cliente){
        for (Cliente percorrerLista : clienteList){
            if (percorrerLista.getCpf().equals(cliente.getCpf())){
                //throw new Exception("Cliente já existe");
            }
        }



    }



    //visualizarCliente


    public List<Cliente> Cliente() {
        return clienteList;
    }
/*
    public Cliente pesquCliente(String cpf){
        Cliente cliente = null;

        for ( Clente percorrelista: cliente){
            if(percorrelista.)

        }

    }


    public VisualizarCliente( )



    //calculoDoOrçamento
*/
}
