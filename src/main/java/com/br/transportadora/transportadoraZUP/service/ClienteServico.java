package com.br.transportadora.transportadoraZUP.service;

import com.br.transportadora.transportadoraZUP.dominio.Cliente;
import com.br.transportadora.transportadoraZUP.dominio.Orcamento;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class ClienteServico {

    //cadastrarCliente

    public List<Cliente> clientes = new ArrayList<>();

    public Cliente CadastrarClienteList(Cliente cliente){

        clientes.add(cliente);
        return cliente;
    }



    public Cliente cadastrarRotaParaCliente(String cpf, Orcamento orcamento) throws Exception {

        for (Cliente cliente: clientes){
            if (cliente.getCliente().getCpf().equals(cpf)) {
                cliente.getOrcamentos().add(orcamento);
                return cliente;
            }
        }
        throw new Exception("Cliente não encontrado");

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
