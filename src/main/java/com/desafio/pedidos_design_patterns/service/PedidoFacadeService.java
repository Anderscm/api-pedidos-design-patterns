package com.desafio.pedidos_design_patterns.service;

import com.desafio.pedidos_design_patterns.model.Pedido;
import com.desafio.pedidos_design_patterns.repository.PedidoRepository;
import com.desafio.pedidos_design_patterns.strategy.CalculoFreteStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PedidoFacadeService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private Map<String, CalculoFreteStrategy> estrategiasFrete;

    public Pedido criarPedido(String cliente, double valorBruto, String tipoFrete) {
        CalculoFreteStrategy strategy = estrategiasFrete.get(tipoFrete.toUpperCase());

        if (strategy == null) {
            throw new IllegalArgumentException("Tipo de frete inválido: " + tipoFrete);
        }

        double frete = strategy.calcularFrete(valorBruto);
        double valorFinal = valorBruto + frete;

        Pedido pedido = new Pedido(cliente, valorBruto, valorFinal, tipoFrete.toUpperCase());
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}