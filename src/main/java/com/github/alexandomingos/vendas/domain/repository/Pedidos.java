package com.github.alexandomingos.vendas.domain.repository;

import com.github.alexandomingos.vendas.domain.entity.Cliente;
import com.github.alexandomingos.vendas.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

        List<Pedido> findByCliente(Cliente cliente);
}
