package com.otavio.api_gerenciador_estoque.service;

import com.otavio.api_gerenciador_estoque.model.Fornecedor;
import com.otavio.api_gerenciador_estoque.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor saveFornecedor(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor findById(Long id){
        return fornecedorRepository.findById(id).orElse(null);
    }

    public List<Fornecedor> findAll(){
        return fornecedorRepository.findAll();
    }
}
