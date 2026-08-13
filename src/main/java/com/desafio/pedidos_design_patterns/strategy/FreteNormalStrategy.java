package com.desafio.pedidos_design_patterns.strategy;

import org.springframework.stereotype.Component;

@Component("NORMAL")
public class FreteNormalStrategy implements CalculoFreteStrategy {
    @Override
    public double calcularFrete(double valorPedido) {
        return 15.0;
    }
}