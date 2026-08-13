package com.desafio.pedidos_design_patterns.repository;

import com.desafio.pedidos_design_patterns.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {}