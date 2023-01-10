package br.com.emanureiis.jpa.modelo;

import jakarta.persistence.Entity;

@Entity // Faz com que o JPA mapeie o modelo como um entidade dentro do nosso banco
public class Conta {
	
	private Long id; //Chave primária do modelo
	private Integer agencia;
	private Integer numero;
	private Integer titular;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getTitular() {
		return titular;
	}
	public void setTitular(Integer titular) {
		this.titular = titular;
	}
}
