package com.nelioalves.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Atributos basicos da classe
	private Integer id;
	private String nome;
	//construtor vazio
	public Categoria(){
	}
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	//Geters e setlers = metodos de acesso para os atributos
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
	//Operacoes para comparar os objetos por valor
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
	
}
