package com.treina.consultacep.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.treina.consultacep.model.EnderecoModel;

@FeignClient(name = "viacep", url="https://viacep.com.br/ws")

public interface EnderecoRepository {

    @GetMapping(name = "{cep}/json")
    EnderecoModel obterCep(@PathVariable("cep") String cep);
    
}
