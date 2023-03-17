package br.com.zoologico.beans;

public class Ave extends Animal {
	private int quantidadeMediaOvos;

	public int getQuantidadeMediaOvos() {
		return quantidadeMediaOvos;
	}

	public void setQuantidadeMediaOvos(int quantidadeMediaOvos) {
		this.quantidadeMediaOvos = quantidadeMediaOvos;
	}

	public void retornarCadastroAve(double pesoSujeira) {
		System.out.println("Nome do animal: " + getNome() + "\n" + "Peso do animal: " + getPeso() + " Kg\n"
				+ "Quantidade média de ovos: " + getQuantidadeMediaOvos() + "\nPeso total animal (peso + peso sujeira): "
				+ (getPeso() + pesoSujeira) + " Kg");
	}
}
