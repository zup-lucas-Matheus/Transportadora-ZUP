package com.br.transportadora.transportadoraZUP.service;

import com.br.transportadora.transportadoraZUP.dominio.Categoria;
import com.br.transportadora.transportadoraZUP.dominio.Cliente;
import com.br.transportadora.transportadoraZUP.dominio.Frete;
import com.br.transportadora.transportadoraZUP.dominio.Orcamento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ClienteServico {


    public List<Cliente> clientes = new ArrayList<>();


    public Cliente CadastrarClienteList(Cliente cliente) throws Exception {
        verificarExiste(cliente);
        clientes.add(cliente);
        return cliente;
    }


    public Cliente cadastrarOrcamentoParaCliente(String cpf, Orcamento orcamento) throws Exception {

        for (Cliente cliente : clientes) {
            if (cliente.getCliente().getCpf().equals(cpf)) {
                cliente.getOrcamentos().add(orcamento);
                return cliente;
            }
        }
        throw new Exception("Cliente não encontrado");
    }

    public void verificarExiste(Cliente cliente) throws Exception {
        for (Cliente clientes : clientes){
            if (clientes.getCliente().getCpf().equals(cliente.getCliente().getCpf())){
                throw new Exception("Cliente já existe");
            }
        }

    }

    //visualizarCliente
    public List<Cliente> listaDeCliente(){
        return clientes;
    }


    public String excluirContaCliente(String cpf, String codigoDeContrato) throws Exception {

        for (Cliente cliente: clientes) {
            if (cliente.getCliente().getCpf().equals(cpf)) {
                for (Iterator iterator = cliente.getOrcamentos().iterator(); iterator.hasNext();){

                    Orcamento orcamento = (Orcamento) iterator.next();
                    if (orcamento.getCodigoDeContrato().equals(codigoDeContrato)) {
                        iterator.remove();
                    }
                    return "Conta removida com sucesso";
                }
            }
        }
        throw new Exception("Cliente não encontrado");
    }

//
//    public Categoria escolhaCategoria(String cpf, Orcamento categoria){
//
//        for (Cliente cliente: clientes) {
//            if (cliente.getCliente().getCpf().equals(cpf)){
//                cliente.getOrcamentos().add(categoria);
//            }
//        }
//
//
//
//    }
//
public Cliente cadastrarFreteParaCliente(String cpf, Frete frete) throws Exception {

    for (Cliente cliente : clientes) {
        if (cliente.getCliente().getCpf().equals(cpf)) {
            cliente.getFretes().add(frete);
            return cliente;
        }
    }
    throw new Exception("Cliente não encontrado");
}


public double calculoDeDestino(String cpf,Frete frete) throws Exception {

     for (Cliente cliente : clientes) {
        if (cliente.getCliente().getCpf().equals(cpf)) {
            for (Frete frete1: cliente.getFretes()){

                if (frete1.getDistancia() < 30) {
                    throw new Exception( "Não atendemos fretes com distacia menores que 30km");

                }
                    return frete.valorDoFrete();

                }
            }
        }

    throw new Exception( "Não atendemos fretes com distacia menores que 30km");

}

}
