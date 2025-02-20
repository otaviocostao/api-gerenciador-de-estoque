package com.otavio.api_gerenciador_estoque.service;

import com.otavio.api_gerenciador_estoque.model.Categoria;
import com.otavio.api_gerenciador_estoque.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria saveCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria findById(Long id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }


}
