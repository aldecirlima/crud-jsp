package com.crudjspjava.bean;

public class Usuario {

	private Integer id;
	private String nome;
	private String password;
	private String email;
	private String sexo;
	private String pais;

	public Usuario(String nome, String password, String email, String sexo, String pais) {
		this.nome = nome;
		this.password = password;
		this.email = email;
		this.sexo = sexo;
		this.pais = pais;
	}

	public Usuario() {

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
