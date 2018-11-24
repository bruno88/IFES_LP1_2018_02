package Interfaces;

import java.io.IOException;

public class Ingrediente implements IWritable {
	private String nome, gosto;
	
	public Ingrediente (String nome, String gosto) {
		this.nome = nome;
		this.gosto = gosto;
	}
	
	

	@Override
	public String toString() {
		return "Ingrediente [nome=" + nome + ", gosto=" + gosto + "]";
	}



	@Override
	public void salvaTxt() throws IOException {
		FileHandler.salvarComAppend("Ingrediente.txt", this.toString());
		
	}
}
