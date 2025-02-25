package com.otavio.api_gerenciador_estoque.controller;

import com.otavio.api_gerenciador_estoque.model.Produto;
import com.otavio.api_gerenciador_estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping()
    public ResponseEntity<Produto> saveProduto(@RequestBody Produto produto){
        produto = produtoService.saveProduto(produto);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping()
    public ResponseEntity<List<Produto>> findAll(){
        List<Produto> produtos = produtoService.findAll();
        return ResponseEntity.ok().body(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id){
        Produto produto = produtoService.findById(id);
        return ResponseEntity.ok().body(produto);
    }


}
