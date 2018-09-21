package Conteudo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//
		Animal cavalo = new Animal("Cavalo", 6);
		Pessoa p1 = new Pessoa("bruno", "123", "9999", "a@b.c", 21);
		Pessoa p2 = new Pessoa("joão", "123", "9999", "a@b.c", 22);
		Pessoa p3 = new Pessoa("ana", "123", "9999", "a@b.c", 23);
		Animal a1 = new Animal("ponei", 6);
		Animal a2 = new Animal("dragão de komodo", 6);
		//
		
		/*Animal camelo = new Animal("Camelo", 13, 120);

		ControleAnimal.adicionar(cavalo);
		ControleAnimal.adicionar(camelo);

		System.out.println(ControleAnimal.getStringTodos());

		System.out.println("Digite o nome do animal " 
		+ "à ser consultado: ");

		String nome = entrada.nextLine();

		entrada.close();

		Animal animalConsultado = ControleAnimal.consultar(nome);
		if (animalConsultado != null) {
			System.out.println(animalConsultado.toString());
		} else {
			System.out.println("Animal não encontrado !");
		}*/
		


		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		ArrayList<Animal> animais = new ArrayList<Animal>();
		
		// venda 1
		animais.add(a2);
		pessoas.add(p2);
		pessoas.add(p3);
		
		String resultAnimais = "", resultPessoas="", resultSeresVivos ="";
		for (int i = 0; i < animais.size(); i++) {
			resultAnimais += animais.get(i).toString() + "\n";
		}
		for (int i = 0; i < pessoas.size(); i++) {
			resultPessoas += pessoas.get(i).toString() + "\n";
		}
		//System.out.println(resultAnimais);
		//System.out.println(resultPessoas);
		
		ArrayList<SerVivo> seresVivos = new ArrayList<SerVivo>();
		seresVivos.add(a2);
		seresVivos.add(p2);
		seresVivos.add(p3);
		Carro c1 = new Carro("prata", "fiat", 4);
		
		for (int i = 0; i < seresVivos.size(); i++) {
			
			System.out.println();
			resultSeresVivos += seresVivos.get(i).toString() 
					+ " - "+ 
					seresVivos.get(i).getClass().
					getSimpleName() + " - \n";
		}
		System.out.println(resultSeresVivos);
		
	}

}
