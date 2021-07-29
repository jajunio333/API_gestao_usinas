package com.JuraSFv.Gestao_de_vendas.model;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sistema")
public class SistemaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//inserir automatic os ids incrementando
    private long id;

    @Column(nullable = false)
    private String placas;

    @Column(nullable = false)
    private String inversores;

    @Column(nullable = false)
    private int numPlacas;

    @Column(nullable = false)
    private int numInversores ;

    @Column(nullable = false)
    private  double custo;

    @Column(nullable = false)
    private  String fornecedor;

    @OneToOne
    @JoinColumn(name = "id")
    EngenheiroEntity engenheiro;


}
