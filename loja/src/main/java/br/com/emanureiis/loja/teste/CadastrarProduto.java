package br.com.emanureiis.loja.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.emanureiis.loja.dao.ProdutoDao;
import br.com.emanureiis.loja.modelo.Categoria;
import br.com.emanureiis.loja.modelo.Produto;
import br.com.emanureiis.loja.util.JPAUtil;

public class CadastrarProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), Categoria.CELULARES);

		EntityManager manager = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(manager);
		
		manager.getTransaction().begin();
		dao.cadastrar(celular);
		manager.getTransaction().commit();
		manager.close();
	}
}
