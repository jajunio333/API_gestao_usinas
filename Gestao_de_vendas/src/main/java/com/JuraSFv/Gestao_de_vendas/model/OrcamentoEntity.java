package com.JuraSFv.Gestao_de_vendas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orcamento")
public class OrcamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//inserir automatic os ids incrementando
    private int id;

    @Column(nullable = false)
    private Date dataCriação;

    @Column(nullable = false)
    private Date dataValidade;

    @Column(nullable = false)
    private double valor;
}
