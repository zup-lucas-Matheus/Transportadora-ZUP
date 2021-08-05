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
double ClienteOrc;
    // verificar se existe
    public Cliente clienteOrcamento(Cliente cpf) throws Exception {
        for (Cliente objLista : clientes){
            if (objLista.getCliente().getCpf().equals(cpf)){
                //throw new Exception("Cliente já existe");

                 ClienteOrc = objLista.getDistancia();
            }
        }
        throw new Exception("Cliente já existe");
    }
//====================================================================
    //escolher o tipo de categoria
    public double calculoCategoria() {

        double tpCategoria;
        if(this.ClienteOrc <= 100){
          tpCategoria =  Categoria.Valor.getCatC();
        }else if (this.ClienteOrc <= 250){
          tpCategoria =  Categoria.Valor.getCatB();
        }else {
            tpCategoria = Categoria.Valor.getCatA();
        }
      return tpCategoria;
    }


//Calculo do orcamento entre o resultado do
    public double obterOrcamento(){
        double orcamento = this.ClienteOrc * this.calculoCategoria();
        return orcamento;
    }







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
