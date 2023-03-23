package br.com.zoologico.beans;

public class Animal {
	private String nome;
	private int peso;
	private double pesoSujeira;

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

	public double getPesoSujeira() {
		return pesoSujeira;
	}

	public void setPesoSujeira(double pesoSujeira) {
		this.pesoSujeira = pesoSujeira;
	}

}
