package Ex2Abstract;

public class Leao extends Felino {

	public Leao(String nome, int idade, int tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" est� rugindo alto");
	}

	@Override
	public void comer() {
		System.out.println("Um " + 
				this.getClass().getSimpleName() +
				" chamado " + this.nome + 
				" est� comendo insetos (HAKUNA MATATA!)");
	}

}
