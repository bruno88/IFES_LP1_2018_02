package Conteudo1;

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
	
	

}
