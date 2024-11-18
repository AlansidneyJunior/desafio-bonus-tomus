package com.tomus.inventory_management.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomus.inventory_management.models.GrupoProduto;
import com.tomus.inventory_management.services.GrupoProdutoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/grupos")
@RequiredArgsConstructor
public class GrupoProdutoController {
    private final GrupoProdutoService grupoProdutoService;

    @GetMapping
    public List<GrupoProduto> listarTodos() {
        return grupoProdutoService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<GrupoProduto> salvar(@RequestBody GrupoProduto grupoProduto) {
        return ResponseEntity.ok(grupoProdutoService.salvar(grupoProduto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GrupoProduto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(grupoProdutoService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        grupoProdutoService.deletar(id);
    }
}
