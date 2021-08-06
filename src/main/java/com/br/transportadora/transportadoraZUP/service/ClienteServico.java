package com.br.transportadora.transportadoraZUP.service;

import com.br.transportadora.transportadoraZUP.dominio.Categoria;
import com.br.transportadora.transportadoraZUP.dominio.Cliente;
import com.br.transportadora.transportadoraZUP.dominio.Orcamento;
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



    public Cliente cadastrarRotaParaCliente(String cpf, Orcamento orcamento) throws Exception {

        for (Cliente cliente: clientes){
            if (cliente.getCliente().getCpf().equals(cpf)) {
                cliente.getOrcamentos().add(orcamento);
                return cliente;
            }
        }
        throw new Exception("Cliente não encontrado");

    }

    public Cliente buscarClienteporCodigo(String codigo) throws Exception {
        for (Cliente clientes: clientes) {
            if (clientes.getOrcamentos().equals(codigo)) {
                return clientes;
            }
        }

        throw new Exception("Cliente não encontrado");
    }

//*=============================================================
// fazer calco do orcamento
double ClienteDist;
    // verificar se existe
    public Cliente clienteDistanciaPercurso(Cliente cpf) throws Exception {
        for (Cliente objLista : clientes){
            if (objLista.getCliente().getCpf().equals(cpf)){
                //throw new Exception("Cliente já existe");

                 ClienteDist = objLista.getDistancia();

            }
        }
        throw new Exception("Cliente já existe");
    }
//====================================================================
    //escolher o tipo de categoria
    public double EscolhaCategoria() {
        double tpCategoria;
        if(this.ClienteDist <= 100){
          tpCategoria =  Categoria.Valor.getCatC();
        }else if (this.ClienteDist <= 250){
          tpCategoria =  Categoria.Valor.getCatB();
        }else {
            tpCategoria = Categoria.Valor.getCatA();
        }
      return tpCategoria;
    }
//====================================================================

//escolher o tipo de categoria
public double SeguroViagem() {
    double tpSeguro;
    if(this.ClienteDist <= 50){
        tpSeguro = 0;
    }else if (this.ClienteDist <= 100){
        tpSeguro =  95;
    }else if (this.ClienteDist <= 250){
        tpSeguro =  150;
    }else if (this.ClienteDist <= 550){
        tpSeguro =  350;
    }else if (this.ClienteDist <= 1000){
        tpSeguro =  550;
    }else {
        tpSeguro = 750;
    }
    return tpSeguro;
}

//=============================================================================


//Calculo do orcamento entre o resultado do
    public double obterOrcamento(){
        double orcamento = ( this.ClienteDist * EscolhaCategoria()) + SeguroViagem();
        return orcamento;
    }

//=============================================================================





//===============================================================
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
