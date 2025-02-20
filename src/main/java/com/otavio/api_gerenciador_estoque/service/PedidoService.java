package com.otavio.api_gerenciador_estoque.service;

import com.otavio.api_gerenciador_estoque.model.Pedido;
import com.otavio.api_gerenciador_estoque.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido savePedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public Pedido findById(Long id){
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> findAll(){
        return pedidoRepository.findAll();
    }
}
