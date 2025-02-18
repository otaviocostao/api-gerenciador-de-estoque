package com.otavio.api_gerenciador_estoque.repository;

import com.otavio.api_gerenciador_estoque.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
