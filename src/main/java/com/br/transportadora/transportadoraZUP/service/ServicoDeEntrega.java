package com.br.transportadora.transportadoraZUP.service;

import com.br.transportadora.transportadoraZUP.dominio.Cliente;
import com.br.transportadora.transportadoraZUP.dominio.Frete;
import com.br.transportadora.transportadoraZUP.dominio.Orcamento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoDeEntrega {

    public List<Cliente> clientes = new ArrayList<>();




//    public Cliente cadastrarFreteParaCliente(String cpf, Frete frete) throws Exception {
//
//        for (Cliente cliente : clientes) {
//            if (cliente.getCliente().getCpf().equals(cpf)) {
//                cliente.getFretes().add(frete);
//                return cliente;
//            }
//        }
//        throw new Exception("Cliente não encontrado");
//    }


}
