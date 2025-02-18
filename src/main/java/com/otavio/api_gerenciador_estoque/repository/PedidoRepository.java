package com.otavio.api_gerenciador_estoque.repository;

import com.otavio.api_gerenciador_estoque.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
