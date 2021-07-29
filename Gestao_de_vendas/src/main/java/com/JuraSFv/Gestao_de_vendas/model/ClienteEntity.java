package com.JuraSFv.Gestao_de_vendas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "cliente")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//inserir automatic os ids incrementando
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    private boolean vendido;

    @OneToOne
    @JoinColumn(name = "id_contrato")
    ContratoEntity contrato;

    @OneToOne
    @JoinColumn(name = "id_sistema")
    SistemaEntity sistema;

    @OneToOne
    @JoinColumn(name = "id_obra")
    ObraEntity obra;

    @OneToMany
    @JoinColumn(name = "id_orcamento")
    Set<OrcamentoEntity> orcamento;
}
