package com.bv.action;

import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Metodo padrao executado pelo submit
	public String execute() {
		String ir = ERROR; //"error" em minusculo eh retornado
		if (getUsuario().equals("bv") && getSenha().equals("bv")) {
			ir = SUCCESS; //"success" em minusculo eh retornado
			setNome("Bruno Vitalino");
		}
		return ir;
	}

	// Bean
	private String usuario;
	private String senha;
	private String nome;

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}
