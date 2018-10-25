package Ex2Abstract;

public abstract class Canino extends Animal {

	public Canino(String nome, int idade, int tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void vaguear() {
		System.out.println(
				"Um " + this.getClass()
					.getSimpleName() + " chamado " +
						super.nome + " est� correndo atr�s dos carros...");
	}

}
