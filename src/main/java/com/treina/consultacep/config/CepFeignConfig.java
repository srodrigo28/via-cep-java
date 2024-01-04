package com.treina.consultacep.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CepFeignConfig {

    @Value("${api.cep.username}")
    private String usuario;

    @Value("${api.cep.senha}")
    private String senha;

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(usuario, senha);
    }

}
