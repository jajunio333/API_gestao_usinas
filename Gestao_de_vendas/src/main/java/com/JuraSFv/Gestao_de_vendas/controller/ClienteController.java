package com.JuraSFv.Gestao_de_vendas.controller;

import com.JuraSFv.Gestao_de_vendas.model.ClienteEntity;
import com.JuraSFv.Gestao_de_vendas.repository.ClienteRepository;
import com.JuraSFv.Gestao_de_vendas.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/gestao")

public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cadastrar")
    public ClienteEntity criarCliente(@RequestBody ClienteEntity criarCliente){
        return  clienteService.saveCliente(criarCliente);
    }

    @GetMapping("/findall")
    public List<ClienteEntity> getclienteList(){
        return clienteService.buscarTodos();
    }

    @GetMapping("/{idCliente}")
    public ResponseEntity<ClienteEntity> getclienteid(@PathVariable("idCliente") Long idCliente) throws Exception{
        return  ResponseEntity.ok(clienteService.getById(idCliente).orElseThrow(() -> new NoSuchElementException("Não encontrado!")));
    }

    @PutMapping
    public ClienteEntity updateCliente(@RequestBody ClienteEntity clienteEntity){
        return clienteService.updateCliente(clienteEntity);
    }

    @DeleteMapping("/{idCliente}")
    public ResponseEntity deleteByID(@PathVariable("idCliente") Long idCliente) throws Exception {
        try {
            clienteService.deleteCliente(idCliente);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<ClienteEntity>) ResponseEntity.ok();

    }
}
