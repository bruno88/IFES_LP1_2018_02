package CorrecaoProva.Prova1;

public class Funcionario extends Pessoa {
	private int SIAPE;

	public Funcionario(String nome, String sexo, int idade, int sIAPE) {
		super(nome, sexo, idade);
		SIAPE = sIAPE;
	}

	public int getSIAPE() {
		return SIAPE;
	}

	public void setSIAPE(int sIAPE) {
		SIAPE = sIAPE;
	}

	@Override
	public String toString() {
		return "Funcionario [SIAPE=" + SIAPE + "]";
	}
	
	
	
}
