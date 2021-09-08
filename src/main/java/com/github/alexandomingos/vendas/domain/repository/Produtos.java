package com.github.alexandomingos.vendas.domain.repository;

import com.github.alexandomingos.vendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
