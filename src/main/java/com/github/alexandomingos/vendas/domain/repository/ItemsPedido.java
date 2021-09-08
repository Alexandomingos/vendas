package com.github.alexandomingos.vendas.domain.repository;

import com.github.alexandomingos.vendas.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
