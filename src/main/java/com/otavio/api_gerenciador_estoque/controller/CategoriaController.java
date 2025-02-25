package com.otavio.api_gerenciador_estoque.controller;

import com.otavio.api_gerenciador_estoque.model.Categoria;
import com.otavio.api_gerenciador_estoque.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping()
    public ResponseEntity<Categoria> saveCategoria(@RequestBody Categoria categoria){
        categoria = categoriaService.saveCategoria(categoria);
        return ResponseEntity.ok().body(categoria);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id){
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok().body(categoria);
    }

    @GetMapping()
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> categorias = categoriaService.findAll();
        return ResponseEntity.ok().body(categorias);
    }


}
