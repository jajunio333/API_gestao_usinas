package com.JuraSFv.Gestao_de_vendas.repository;


import com.JuraSFv.Gestao_de_vendas.model.ClienteEntity;
import com.JuraSFv.Gestao_de_vendas.model.ContratoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<ContratoEntity, Long> {
}
