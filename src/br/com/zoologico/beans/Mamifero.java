package br.com.zoologico.beans;

public class Mamifero extends Animal {
	private int tempoGestacao;

	public int getTempoGestacao() {
		return tempoGestacao;
	}

	public void setTempoGestacao(int tempoGestacao) {
		this.tempoGestacao = tempoGestacao;
	}

	public void retornarCadastroMamifero(double pesoSujeira) {
		System.out.println("Nome do animal: " + getNome() + "\n" + "Peso do animal: " + getPeso() + " Kg\n"
				+ "Tempo de gestação: " + getTempoGestacao() + " (dias)" + "\nPeso total animal (peso + peso sujeira): "
				+ (getPeso() + pesoSujeira) + " Kg");
	}
}
