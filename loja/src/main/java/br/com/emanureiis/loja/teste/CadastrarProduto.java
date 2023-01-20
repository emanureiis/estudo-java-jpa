package br.com.emanureiis.loja.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.emanureiis.loja.modelo.Produto;

public class CadastrarProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		celular.setNome("Xiomi");
		celular.setDescricao("Blá blá blá");
		celular.setPreco(new BigDecimal("800"));
		
		/**
		 * Para realizar a persistência do objeto são necessários os seguintes passos:
		 * 
		 *  1. Instanciar uma Factory de EntityManager;
		 *  2. Instanciar um EntityManeger a partir da Factory;
		 *  4. Realizar aa persistência
		 */
		
		// Instanciando a fábrica e logo após criando o gerenciador
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");//O parâmetro deve ser o mesmo name do persistence-unit para que a aplicação consiga se conectar com o banco de dados;
		EntityManager manager = factory.createEntityManager();
		
		// Open a transaction
		manager.getTransaction().begin();
		// Insert the object
		manager.persist(celular);
		// Close and commit the transaction
		manager.getTransaction().commit();
		manager.close();
	}
}
