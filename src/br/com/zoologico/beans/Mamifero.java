package br.com.zoologico.beans;

public class Mamifero extends Animal {
	private int tempoGestacao;

	public int getTempoGestacao() {
		return tempoGestacao;
	}

	public void setTempoGestacao(int tempoGestacao) {
		this.tempoGestacao = tempoGestacao;
	}

	// Recebe como parametro o peso da sujeira que foi passado para o retornarCadastroMamifero na classe TesteMetodos
	public void retornarCadastroMamifero(double pesoSujeira) {
		System.out.println("Nome do animal: " + getNome() + "\nPeso do animal: " + getPeso() + " Kg\n"
				+ "Peso sujeira: " + pesoSujeira + " Kg\n"
				+ "Peso total animal (peso + peso sujeira): " + (getPeso() + pesoSujeira) + " Kg\n"
				+ "Tempo de gestação: " + getTempoGestacao() + " (dias)");
	}
}
