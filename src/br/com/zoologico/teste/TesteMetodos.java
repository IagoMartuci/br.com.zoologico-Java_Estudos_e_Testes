package br.com.zoologico.teste;

import javax.swing.JOptionPane;

import br.com.zoologico.beans.Ave;
import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.beans.Reptil;

public class TesteMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}

	public static void Menu() {
		int opcao;

		do {
			opcao = (Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma opção\n" + "1 - Mamiferos\n" + "2 - Repteis\n" + "3 - Aves\n" + "0 - Sair")));

			switch (opcao) {
			case 1:
				Mamiferos();
				break;
			case 2:
				Repteis();
				break;
			case 3:
				Aves();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Por favor, escolha uma opção válida.");
			}
		} while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0);

	}

	public static void Mamiferos() {
		var mamifero = new Mamifero();
		
		mamifero.setNome(JOptionPane.showInputDialog("Informe o nome do primeiro mamifero"));
		mamifero.setPeso(
				Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do animal: " + mamifero.getNome())));

		int opcao;
		
		do {
		opcao = Integer
				.parseInt(JOptionPane.showInputDialog("Informe o grau de limpeza do animal: " + mamifero.getNome()
						+ "\n1 - Limpo\n2 - Normal\n3 - Sujo"));
		} while (opcao != 1 && opcao != 2 && opcao != 3);

		double recebePesoSujeira;
		
		if (opcao == 3)
			recebePesoSujeira = 1;
		else if (opcao == 2)
			recebePesoSujeira = 0.5;
		else
			recebePesoSujeira = 0;
	
		mamifero.setTempoGestacao(Integer.parseInt(
				JOptionPane.showInputDialog("Informe o tempo de gestação (em dias) do animal: " + mamifero.getNome())));

		mamifero.retornarCadastroMamifero(recebePesoSujeira);

		System.out.println("------------------------------------------------------------------------------------------");
		
		var mamiferoDois = new Mamifero();
		mamiferoDois.setNome(JOptionPane.showInputDialog("Informe o nome do segundo mamifero"));
		mamiferoDois.setPeso(
				Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do animal: " + mamiferoDois.getNome())));

		do {
		opcao = Integer
				.parseInt(JOptionPane.showInputDialog("Informe o grau de limpeza do animal: " + mamiferoDois.getNome()
						+ "\n1 - Limpo\n2 - Normal\n3 - Sujo"));
		} while (opcao != 1 && opcao != 2 && opcao != 3);
		
		if (opcao == 3)
			recebePesoSujeira = 1;
		else if (opcao == 2)
			recebePesoSujeira = 0.5;
		else
			recebePesoSujeira = 0;
	
		mamiferoDois.setTempoGestacao(Integer.parseInt(
				JOptionPane.showInputDialog("Informe o tempo de gestação (em dias) do animal: " + mamiferoDois.getNome())));

		mamiferoDois.retornarCadastroMamifero(recebePesoSujeira);
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		var mamiferoTres = new Mamifero();
		mamiferoTres.setNome(JOptionPane.showInputDialog("Informe o nome do terceiro mamifero"));
		mamiferoTres.setPeso(
				Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do animal: " + mamiferoTres.getNome())));

		do {
		opcao = Integer
				.parseInt(JOptionPane.showInputDialog("Informe o grau de limpeza do animal: " + mamiferoTres.getNome()
						+ "\n1 - Limpo\n2 - Normal\n3 - Sujo"));
		} while (opcao != 1 && opcao != 2 && opcao != 3);
		
		if (opcao == 3)
			recebePesoSujeira = 1;
		else if (opcao == 2)
			recebePesoSujeira = 0.5;
		else
			recebePesoSujeira = 0;
	
		mamiferoTres.setTempoGestacao(Integer.parseInt(
				JOptionPane.showInputDialog("Informe o tempo de gestação (em dias) do animal: " + mamiferoTres.getNome())));

		mamiferoTres.retornarCadastroMamifero(recebePesoSujeira);
	}

	public static void Repteis() {
		var reptil = new Reptil();
		
		var i = 0;
		
		do {
			i++;
			
			if (i > 3)
				return;
			
			reptil.setNome(JOptionPane.showInputDialog("Informe o nome do réptil " + i));
			reptil.setPeso(
					Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do animal: " + reptil.getNome())));
			
			// Passamos como parametros o getNome que é string + e algum número double
			double returnGrauDeLimpeza = GrauDeLimpeza(reptil.getNome(), 0.0);
			
			reptil.setQuantidadeMediaOvos(Integer.parseInt(
					JOptionPane.showInputDialog("Informe a quantidade média de ovos do animal: " + reptil.getNome())));
			
			// Recebe o retorno do double peso que está no método GrauDeLimpeza e passa como parametro para o método retornarCadastroReptil
			reptil.retornarCadastroReptil(returnGrauDeLimpeza);
		} while (i <= 3);
	}

	public static void Aves() {
		var ave = new Ave();
		
		var i = 1;
		
		while (i <= 3) {
			
			ave.setNome(JOptionPane.showInputDialog("Informe o nome da ave " + i));
			ave.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do animal: " + ave.getNome())));
			
			// Passamos como parametros o getNome que é string + getPesoSujeira que é double
			double returnGrauDeLimpeza = GrauDeLimpeza(ave.getNome(), ave.getPesoSujeira());
			
			// Recebe o retorno do double peso que está no método GrauDeLimpeza e passa como parametro para o setPesoSujeira
			// Apenas para poder demonstrar o peso da sujeira separado do peso do animal
			ave.setPesoSujeira(returnGrauDeLimpeza);
			
			ave.setQuantidadeMediaOvos(Integer.parseInt(
					JOptionPane.showInputDialog("Informe a quantidade média de ovos do animal: " + ave.getNome())));
			
			// Recebe o retorno do double peso que está no método GrauDeLimpeza e passa como parametro para o método retornarCadastroAve
			ave.retornarCadastroAve(returnGrauDeLimpeza);
<<<<<<< HEAD
			//OU
			ave.retornarCadastroAve(ave.getPesoSujeira());
=======
>>>>>>> 70cf3226ae878ff12372af1c8f13d7a5793d6950
			
			i++;
		}
	}
	
	// Método recebe os parametros que passamos e faz as operações que estão programadas
	public static double GrauDeLimpeza(String nomeAnimal, double pesoSujeira) {
		int opcao;
		do {
			opcao = Integer
					.parseInt(JOptionPane.showInputDialog("Informe o grau de limpeza do animal: " + nomeAnimal
							+ "\n1 - Limpo\n2 - Normal\n3 - Sujo"));
			} while (opcao != 1 && opcao != 2 && opcao != 3);
			
			double peso;
			if (opcao == 3) 
				peso = 1;
			else if (opcao == 2)
				peso = 0.5;
			else
				peso = 0;
			
			// Retorna double peso
			return(peso);
	}

}
