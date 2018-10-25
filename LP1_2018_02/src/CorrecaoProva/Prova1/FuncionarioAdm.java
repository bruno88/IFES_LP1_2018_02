package CorrecaoProva.Prova1;

public class FuncionarioAdm extends Funcionario {
	private String setor;

	public FuncionarioAdm(String nome, String sexo, int idade, int sIAPE, String setor) {
		super(nome, sexo, idade, sIAPE);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "FuncionarioAdm [setor=" + setor + "]";
	}

}
