package com.desafio.pedidos_design_patterns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private double valorBruto;
    private double valorFinal;
    private String tipoFrete;

    public Pedido() {}

    public Pedido(String cliente, double valorBruto, double valorFinal, String tipoFrete) {
        this.cliente = cliente;
        this.valorBruto = valorBruto;
        this.valorFinal = valorFinal;
        this.tipoFrete = tipoFrete;
    }

    public Long getId() { return id; }
    public String getCliente() { return cliente; }
    public double getValorBruto() { return valorBruto; }
    public double getValorFinal() { return valorFinal; }
    public String getTipoFrete() { return tipoFrete; }
}