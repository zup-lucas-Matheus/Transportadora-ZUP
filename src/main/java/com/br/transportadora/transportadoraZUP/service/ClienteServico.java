package com.br.transportadora.transportadoraZUP.service;

import com.br.transportadora.transportadoraZUP.dominio.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServico {

    //cadastrarCliente

    public List<Cliente> clientes = new ArrayList<>();

    public Cliente CadastrarClienteList(Cliente cliente){

        clientes.add(cliente);
        return cliente;
    }


    // verificar se existe
//    public void verificarExiste(Cliente cliente){
//        for (Cliente percorrerLista : clienteList){
//            if (percorrerLista.getCpf().equals(cliente.getCpf())){
//                //throw new Exception("Cliente já existe");
//            }
//        }
//
//    }

    //visualizarCliente
    public List<Cliente> listaDeCliente() {

        return clientes;
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
