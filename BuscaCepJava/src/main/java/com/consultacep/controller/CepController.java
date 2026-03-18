package com.consultacep.controller;

import com.consultacep.client.ViaCepClient;
import com.consultacep.dto.EnderecoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {

    private final ViaCepClient viaCepClient;

    public CepController(ViaCepClient viaCepClient) {
        this.viaCepClient = viaCepClient;
    }

    @GetMapping("/{cep}")
    public EnderecoDTO consultaCep(@PathVariable String cep) {
        return viaCepClient.buscaEnderecoPor(cep);
    }
}