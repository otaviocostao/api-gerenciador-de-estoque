package com.otavio.api_gerenciador_estoque.repository;

import com.otavio.api_gerenciador_estoque.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
