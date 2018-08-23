package Conteudo1;

import java.util.ArrayList;

public class ControleAnimal {
	private static ArrayList<Animal> animais = new ArrayList<Animal>();

	public static void adicionar(Animal animal) {
		animais.add(animal);
	}
	
	public static void remover(Animal animal) {
		animais.remove(animal);
	}
	
	public static Animal consultar(String nome) {
		boolean encontrado = false;
		Animal animalEncontrado = null;
		for (int i = 0; 
				!encontrado && i < animais.size()
				; i++) {
			if (animais.get(i).getNome().equalsIgnoreCase(nome)) {
				animalEncontrado = animais.get(i);
				encontrado = true;
			}
		}
		
		return animalEncontrado;
	}
	
	public static String getStringTodos() {
		String result = "";
		for (int i = 0; i < animais.size(); i++) {
			result += animais.get(i).toString() + "\n";
		}
		return result;
	}
}
