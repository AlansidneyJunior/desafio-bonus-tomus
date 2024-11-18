package com.tomus.inventory_management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tomus.inventory_management.models.GrupoProduto;

public interface GrupoProdutoRepository extends JpaRepository<GrupoProduto, Long> {
}