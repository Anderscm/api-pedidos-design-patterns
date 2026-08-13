package com.desafio.pedidos_design_patterns.controller;

import com.desafio.pedidos_design_patterns.model.Pedido;
import com.desafio.pedidos_design_patterns.service.PedidoFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoFacadeService pedidoFacadeService;

    @PostMapping
    public ResponseEntity<Pedido> criarPedido(
            @RequestParam String cliente,
            @RequestParam double valor,
            @RequestParam String tipoFrete) {

        Pedido pedido = pedidoFacadeService.criarPedido(cliente, valor, tipoFrete);
        return ResponseEntity.ok(pedido);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listar() {
        return ResponseEntity.ok(pedidoFacadeService.listarPedidos());
    }
}