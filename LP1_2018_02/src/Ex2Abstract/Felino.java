package Ex2Abstract;

public abstract class Felino extends Animal {

	public Felino(String nome, int idade, 
			int tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void vaguear() {
		System.out.println(
				"Um " + this.getClass()
					.getSimpleName() + " chamado " +
						super.nome + " est� subindo nos m�veis da casa...");
	}
	
	
}
