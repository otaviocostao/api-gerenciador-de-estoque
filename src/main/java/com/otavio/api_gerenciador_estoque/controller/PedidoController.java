package com.otavio.api_gerenciador_estoque.controller;

import com.otavio.api_gerenciador_estoque.model.Pedido;
import com.otavio.api_gerenciador_estoque.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping()
    public ResponseEntity<Pedido> savePedido(@RequestBody Pedido pedido){
        pedido = pedidoService.savePedido(pedido);
        return ResponseEntity.ok().body(pedido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Long id){
        Pedido pedido = pedidoService.findById(id);
        return ResponseEntity.ok().body(pedido);
    }

    @GetMapping()
    public ResponseEntity<List<Pedido>> findByAll(){
        List<Pedido> pedidos = pedidoService.findAll();
        return ResponseEntity.ok().body(pedidos);
    }
}
