package com.JuraSFv.Gestao_de_vendas.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "engenheiro")
public class EngenheiroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//inserir automatic os ids incrementando
    private int id;

    @Column(nullable = false)
    private double custo;

    @Column(nullable = false)
    private String nome;
}
