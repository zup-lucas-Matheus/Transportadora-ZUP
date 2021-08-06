package com.br.transportadora.transportadoraZUP.dominio;

import com.br.transportadora.transportadoraZUP.service.ClienteServico;
import com.br.transportadora.transportadoraZUP.service.ServicoDeEntrega;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class Orcamento {


    private Regiao regiao;
    private Categoria categoria;
//    private double distancia = 0;
    private LocalDate dataEntrega;
    private String codigoDeContrato;

}
