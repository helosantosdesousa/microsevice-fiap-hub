package com.github.helosantosdesousa.MS_Pagamento.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_pagamento")

public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false)
    private BigDecimal valor;
    private String nome;
    private String numeroDoCartao; //xxxx xxxx xxxx xxxx
    private String validade; //MM/YY
    private String codigoDeSeguranca; // xxx
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @Column (nullable = false)
    private Long pedidoId;
    @Column (nullable = false)
    private Long formaDePagamentoId; // 1 - Dinheiro; 2 - Cartão; 3 - Pix
}
