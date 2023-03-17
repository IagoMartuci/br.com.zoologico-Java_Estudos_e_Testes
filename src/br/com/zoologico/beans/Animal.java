package br.com.zoologico.beans;

public class Animal {
	private String nome;
	private int peso;
	private int pesoSujeira;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPesoSujeira() {
		return pesoSujeira;
	}

	public void setPesoSujeira(int pesoSujeira) {
		this.pesoSujeira = pesoSujeira;
	}

}
