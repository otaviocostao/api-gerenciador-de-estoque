package com.otavio.api_gerenciador_estoque.controller;

import com.otavio.api_gerenciador_estoque.model.Fornecedor;
import com.otavio.api_gerenciador_estoque.service.FornecedorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {

    private FornecedorService fornecedorService;

    @PostMapping()
    public ResponseEntity<Fornecedor> saveFornecedor (@RequestBody Fornecedor fornecedor){
        fornecedor = fornecedorService.saveFornecedor(fornecedor);
        return ResponseEntity.ok().body(fornecedor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> findByiId(@PathVariable Long id){
        Fornecedor fornecedor = fornecedorService.findById(id);
        return ResponseEntity.ok().body(fornecedor);
    }

    @GetMapping()
    public ResponseEntity<List<Fornecedor>> findAll(){
        List<Fornecedor> fornecedores = fornecedorService.findAll();
        return ResponseEntity.ok().body(fornecedores);
    }
}
