package br.com.zoologico.teste;

import javax.swing.JOptionPane;

import br.com.zoologico.beans.Ave;
import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.beans.Reptil;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}
	
	public static void Menu() {
		int opcao;
		
		do {
		opcao = (Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção\n"
				+ "1 - Mamiferos\n"
				+ "2 - Repteis\n"
				+ "3 - Aves\n"
				+ "0 - Sair")));
		
		switch(opcao) {
		case 1: Mamiferos(); break;
		case 2: Repteis(); break;
		case 3: Aves(); break;
		case 0: JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema!"); break;
		default: JOptionPane.showMessageDialog(null, "Por favor, escolha uma opção válida.");
		}
		}while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0);
		
		
	}
	
	public static void Mamiferos() {
		var mamifero = new Mamifero();
		mamifero.setNome(JOptionPane.showInputDialog("Informe o nome do mamifero"));
		mamifero.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do animal: " + mamifero.getNome())));
		mamifero.setTempoGestacao(Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de gestação (em dias) do animal: " + mamifero.getNome())));
		
		System.out.println("Nome do animal: " + mamifero.getNome() + "\n"
				+ "Peso do animal: " + mamifero.getPeso() + " Kg\n"
				+ "Tempo de gestação: " + mamifero.getTempoGestacao() + " (dias)");
	}
	
	public static void Repteis() {
		var reptil = new Reptil();
		reptil.setNome(JOptionPane.showInputDialog("Informe o nome do réptil"));
		reptil.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do animal: " + reptil.getNome())));
		reptil.setQuantidadeMediaOvos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade média de ovos do animal: " + reptil.getNome())));
		
		System.out.println("Nome do animal: " + reptil.getNome() + "\n"
				+ "Peso do animal: " + reptil.getPeso() + " Kg\n"
				+ "Quantidade média de ovos: " + reptil.getQuantidadeMediaOvos());
	}
	
	public static void Aves() {
		var ave = new Ave();
		ave.setNome(JOptionPane.showInputDialog("Informe o nome da ave"));
		ave.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do animal: " + ave.getNome())));
		ave.setQuantidadeMediaOvos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade média de ovos do animal: " + ave.getNome())));
		
		System.out.println("Nome do animal: " + ave.getNome() + "\n"
				+ "Peso do animal: " + ave.getPeso() + " Kg\n"
				+ "Quantidade média de ovos: " + ave.getQuantidadeMediaOvos());
	}
	
	

}
