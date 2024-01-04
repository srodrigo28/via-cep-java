package com.treina.consultacep.domain;

import lombok.Data;

@Data
public class EnderecoModel {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
}
