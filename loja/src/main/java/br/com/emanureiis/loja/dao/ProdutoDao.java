package br.com.emanureiis.loja.dao;

import javax.persistence.EntityManager;

import br.com.emanureiis.loja.modelo.Produto;

public class ProdutoDao {
	private EntityManager manager;

	public ProdutoDao(EntityManager manager) {
		this.manager = manager;
	}

	public void cadastrar(Produto produto) {
		this.manager.persist(produto);
	}
}
