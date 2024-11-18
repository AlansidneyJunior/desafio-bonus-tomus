package com.tomus.inventory_management.services;

import org.springframework.stereotype.Service;
import com.tomus.inventory_management.models.GrupoProduto;
import com.tomus.inventory_management.repositories.GrupoProdutoRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GrupoProdutoService {
    private final GrupoProdutoRepository grupoProdutoRepository;

    public List<GrupoProduto> listarTodos() {
        return grupoProdutoRepository.findAll();
    }

    public GrupoProduto salvar(GrupoProduto grupoProduto) {
        return grupoProdutoRepository.save(grupoProduto);
    }

    public GrupoProduto buscarPorId(Long id) {
        return grupoProdutoRepository.findById(id).orElseThrow(() -> new RuntimeException("Grupo não encontrado"));
    }

    public void deletar(Long id) {
        grupoProdutoRepository.deleteById(id);
    }
}