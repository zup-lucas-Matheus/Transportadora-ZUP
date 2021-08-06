package com.br.transportadora.transportadoraZUP.controller;

import com.br.transportadora.transportadoraZUP.dominio.Cliente;
import com.br.transportadora.transportadoraZUP.dominio.Frete;
import com.br.transportadora.transportadoraZUP.dominio.Orcamento;
import com.br.transportadora.transportadoraZUP.service.ClienteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServico clienteServico;

    @PostMapping
    public Cliente cadasstrarCliente(@RequestBody Cliente cliente) throws Exception {

        try {
            return clienteServico.CadastrarClienteList(cliente);
        }catch (Exception erro){

            throw new Exception("Cliente já existe");
        }
    }

    @PostMapping("/orcamento")
    public Cliente cadastraOrcamento(@RequestParam String cpf, @RequestBody Orcamento orcamento) throws Exception {

        return clienteServico.cadastrarOrcamentoParaCliente(cpf, orcamento);

    }

    @GetMapping
    public List<Cliente> listaDeClientes(){

        return clienteServico.listaDeCliente();

    }

    @DeleteMapping
    public String excluirContaCliente(@RequestParam String cpf,@RequestParam String codigoDeContrato) throws Exception {

        return clienteServico.excluirContaCliente(cpf, codigoDeContrato);
    }


    @PostMapping("/frete")
        public Cliente cadastraFrete(@RequestParam String cpf, @RequestBody Frete frete) throws Exception {

        return clienteServico.cadastrarFreteParaCliente(cpf, frete);

    }

    @GetMapping("/calcula")
    public double calculoDeDestino(@RequestParam String cpf, Frete frete) throws Exception {

        try {
            return clienteServico.calculoDeDestino(cpf, frete);
        }
        catch (Exception erro){

            throw new Exception("\"Não atendemos fretes com distacia menores que 30km\"");
        }

    }

}
