package com.bv.model;

public class Artigo
{
	private Integer id;
	private String nome;
	private String preco;
	
	public Artigo(Integer id, String nome, String preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}

}
