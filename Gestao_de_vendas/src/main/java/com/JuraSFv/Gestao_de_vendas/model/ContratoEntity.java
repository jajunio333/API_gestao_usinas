package com.JuraSFv.Gestao_de_vendas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.text.spi.DateFormatProvider;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "contrato")
public class ContratoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//inserir automatic os ids incrementando
    private long id;

    @Column(nullable = false)
    private String dataCriação;

    private boolean ContratoAtivo;
}
