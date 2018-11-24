package Interfaces;

import java.io.IOException;

public class Animal extends SerVivo {
	public Animal(String nome, int idade) {
		super(nome, idade);
	}

	public Animal(String nome, int idade, double peso) {
		super(nome, idade);
	}

	@Override
	public String toString() {
		return "Animal [" + super.getNome() + "]";
	}

	@Override
	public void salvaTxt() throws IOException{
		final String nomeArquivo = "Animal.txt";
		FileHandler.salvarComAppend(nomeArquivo, this.toString());
		
	}
	
	

}
