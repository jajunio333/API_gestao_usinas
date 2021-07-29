package com.JuraSFv.Gestao_de_vendas.service;

import com.JuraSFv.Gestao_de_vendas.model.ClienteEntity;
import com.JuraSFv.Gestao_de_vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteEntity saveCliente(ClienteEntity criarCliente) {
        return clienteRepository.save(criarCliente);
    }

    public List<ClienteEntity> buscarTodos() {
     return (List<ClienteEntity>) clienteRepository.findAll();
    }

    public Optional <ClienteEntity> getById(Long idCliente) {
        return clienteRepository.findById(idCliente);
    }

    public ClienteEntity updateCliente(ClienteEntity clienteEntity){
        return clienteRepository.save(clienteEntity);
    }

    public void deleteCliente(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }
}
