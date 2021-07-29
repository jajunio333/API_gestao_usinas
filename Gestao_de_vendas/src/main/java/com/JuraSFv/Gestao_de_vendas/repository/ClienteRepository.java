package com.JuraSFv.Gestao_de_vendas.repository;


import com.JuraSFv.Gestao_de_vendas.model.ClienteEntity;
import com.JuraSFv.Gestao_de_vendas.model.EngenheiroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
