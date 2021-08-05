package com.br.transportadora.transportadoraZUP.controller;

import com.br.transportadora.transportadoraZUP.dominio.Cliente;
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
    public Cliente cadasstrarCliente(@RequestBody Cliente cliente){

        return clienteServico.CadastrarClienteList(cliente);

    }

    @GetMapping
    public List<Cliente> listaDeClientes(){

        return clienteServico.listaDeCliente();

    }


}
