package com.tomus.inventory_management.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double valor;
    private String unidadeDeMedida;

    @ManyToOne
    @JoinColumn(name = "grupo_id")
    private GrupoProduto grupoProduto;
}