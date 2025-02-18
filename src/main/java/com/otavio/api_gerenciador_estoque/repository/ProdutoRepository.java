package com.otavio.api_gerenciador_estoque.repository;

import com.otavio.api_gerenciador_estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
