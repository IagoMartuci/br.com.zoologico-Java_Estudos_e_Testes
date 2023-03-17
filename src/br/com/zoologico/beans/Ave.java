package br.com.zoologico.beans;

public class Ave extends Animal {
	private int quantidadeMediaOvos;

	public int getQuantidadeMediaOvos() {
		return quantidadeMediaOvos;
	}

	public void setQuantidadeMediaOvos(int quantidadeMediaOvos) {
		this.quantidadeMediaOvos = quantidadeMediaOvos;
	}
	
	// Recebe como parametro o peso da sujeira que foi passado para o retornarCadastroAve na classe TesteMetodos
	public void retornarCadastroAve(double pesoSujeira) {
		System.out.println("Nome do animal: " + getNome() + "\nPeso do animal: " + getPeso() + " Kg\n"
				+ "Peso sujeira: " + getPesoSujeira() + " Kg\n"
				+ "Peso total animal (peso + peso sujeira): " + (getPeso() + getPesoSujeira()) + " Kg\n"
				+ "Quantidade média de ovos: " + getQuantidadeMediaOvos()
				+ "\n------------------------------------------------------------------------------------------");
	}
}
