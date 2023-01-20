package br.com.emanureiis.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Indica para a JPA que esta classe é uma entidade
@Table(name = "produtos") //"JPA, embora o nome da emtidade ser Produto, o nome da tabela no BD produtos".
public class Produto {

	@Id // Indica que abaixo temos uma chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //"JPA, quem vai gerar o identificador não é a aplicação e sim
	//@Column (name ="desc"): indica que o atributo abaixo refere-se à coluna de nome diferente (entre parênteses)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
