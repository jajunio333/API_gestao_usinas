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
@Table(name = "obra")
public class ObraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//inserir automatic os ids incrementando
    private int id;

    @Column(nullable = false)
    private Date dataInicio;

    @Column(nullable = false)
    private Date dataFim;

    private boolean obraAtiva;
}
