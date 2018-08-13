package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.List;

public class FormularioModel {
	private int id;
	private String nome;
	private double valor;
	private String descricao;
	private String categoria;
	List<FormularioModel> lista = new ArrayList<FormularioModel>();

	public List<FormularioModel> getLista() {
		return lista;
	}

	public void setLista(List<FormularioModel> lista) {
		this.lista = lista;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
