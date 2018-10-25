package Ex2Abstract;

public class Hipopotamo extends Animal {

	public Hipopotamo(String nome, int idade,
			int tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" est� grunhindo");
	}

	@Override
	public void comer() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" est� comendo frutas");
	}

	@Override
	public void vaguear() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" est� nadando por ai...");
		
	}

}
