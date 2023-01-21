package br.com.emanureiis.loja.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.emanureiis.loja.dao.ProdutoDao;
import br.com.emanureiis.loja.modelo.Produto;
import br.com.emanureiis.loja.util.JPAUtil;

public class CadastrarProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		celular.setNome("Xiomi");
		celular.setDescricao("Blá blá blá");
		celular.setPreco(new BigDecimal("800"));

		EntityManager manager = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(manager);
		
		manager.getTransaction().begin();
		dao.cadastrar(celular);
		manager.getTransaction().commit();
		manager.close();
	}
}
