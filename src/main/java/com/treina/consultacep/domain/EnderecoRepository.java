package com.treina.consultacep.domain;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url="https://viacep.com.br/ws")
public interface EnderecoRepository {

    @GetMapping("{cep}/json")
    EnderecoModel obterCep(@PathVariable("cep") String cep);
    
}
