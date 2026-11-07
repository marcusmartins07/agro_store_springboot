package com.agro_store.agro_store.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

	public record Produto(String nome, BigDecimal valor) {
	}

	@GetMapping("/produto")
	public List<Produto> buscarProdutos() {
		return List.of(
				new Produto("Produto Teste 1", new BigDecimal("49.90")),
				new Produto("Produto Teste 2", new BigDecimal("89.90")),
				new Produto("Produto Teste 3", new BigDecimal("35.50")),
				new Produto("Produto Teste 4", new BigDecimal("120.00")));
	}

}
