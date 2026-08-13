package com.desafio.pedidos_design_patterns.strategy;

import org.springframework.stereotype.Component;

@Component("EXPRESS")
public class FreteExpressStrategy implements CalculoFreteStrategy {
    @Override
    public double calcularFrete(double valorPedido) {
        return 35.0;
    }
}