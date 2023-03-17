package br.com.zoologico.beans;

public class Reptil extends Animal {
	private int quantidadeMediaOvos;

	public int getQuantidadeMediaOvos() {
		return quantidadeMediaOvos;
	}

	public void setQuantidadeMediaOvos(int quantidadeMediaOvos) {
		this.quantidadeMediaOvos = quantidadeMediaOvos;
	}
	
	// Recebe como parametro o peso da sujeira que foi passado para o retornarCadastroReptil na classe TesteMetodos
	public void retornarCadastroReptil(double pesoSujeira) {
		System.out.println("Nome do animal: " + getNome() + "\nPeso do animal: " + getPeso() + " Kg\n"
				+ "Peso sujeira: " + pesoSujeira + " Kg\n"
				+ "Peso total animal (peso + peso sujeira): " + (getPeso() + pesoSujeira) + " Kg\n"
				+ "Quantidade média de ovos: " + getQuantidadeMediaOvos()
				+ "\n------------------------------------------------------------------------------------------");
	}
}
