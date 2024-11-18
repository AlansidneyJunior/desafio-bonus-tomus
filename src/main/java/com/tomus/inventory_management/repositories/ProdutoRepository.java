package com.tomus.inventory_management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tomus.inventory_management.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}