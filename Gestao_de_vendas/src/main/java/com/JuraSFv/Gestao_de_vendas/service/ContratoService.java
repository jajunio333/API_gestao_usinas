package com.JuraSFv.Gestao_de_vendas.service;

import com.JuraSFv.Gestao_de_vendas.model.ContratoEntity;
import com.JuraSFv.Gestao_de_vendas.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoService {

    @Autowired
    ContratoRepository contratoRepository;

    public ContratoEntity saveContrato(ContratoEntity criarContrato) {
        return contratoRepository.save(criarContrato);
    }



}
