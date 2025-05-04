package com.design_patterns.projeto_design_patterns.Services;

import com.design_patterns.projeto_design_patterns.Model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep",url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
