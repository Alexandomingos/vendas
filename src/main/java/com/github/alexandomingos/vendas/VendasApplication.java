package com.github.alexandomingos.vendas;

import com.github.alexandomingos.vendas.domain.entity.Cliente;
import com.github.alexandomingos.vendas.domain.entity.Pedido;
import com.github.alexandomingos.vendas.domain.repository.Clientes;
import com.github.alexandomingos.vendas.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class VendasApplication {

	@Bean
	public CommandLineRunner commandLineRunner (@Autowired Clientes clientes){
		return args -> {
			Cliente c = new Cliente(null,"Fulano");
			clientes.save(c);
		};

	}


	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
