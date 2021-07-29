package com.JuraSFv.Gestao_de_vendas.controller;

import com.JuraSFv.Gestao_de_vendas.model.ContratoEntity;
import com.JuraSFv.Gestao_de_vendas.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gestao")

public class ContratoController {
    @Autowired
    private ContratoService contratoService;

    @PostMapping("/cadastrarcontrato")
    public ContratoEntity criarContrato(@RequestBody ContratoEntity criarContrato){
        return  contratoService.saveContrato(criarContrato);
    }


}
