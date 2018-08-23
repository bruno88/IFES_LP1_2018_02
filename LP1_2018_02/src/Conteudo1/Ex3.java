package Conteudo1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Animal cavalo = new Animal("Cavalo");
		Animal camelo = new Animal("Camelo", 13, 120);

		ControleAnimal.adicionar(cavalo);
		ControleAnimal.adicionar(camelo);

		System.out.println(ControleAnimal.getStringTodos());

		System.out.println("Digite o nome do animal "
				+ "à ser consultado: ");
		
		String nome = entrada.nextLine();
		
		entrada.close();
		
		Animal animalConsultado = ControleAnimal.
										consultar(nome);
		if (animalConsultado != null) {
			System.out.println(animalConsultado.toString());
		} else {
			System.out.println("Animal não encontrado !");
		}
		
		
		
	}

}
