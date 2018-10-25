package CorrecaoProva.Prova1;

public class TurmaPresencial extends Turma {
	private Endereco enderecoPresencial;

	public TurmaPresencial(Disciplina disciplinaLecionada,
			Endereco enderecoPresencial) {
		super(disciplinaLecionada);
		this.enderecoPresencial = enderecoPresencial;
	}

	public Endereco getEnderecoPresencial() {
		return enderecoPresencial;
	}

	public void setEnderecoPresencial(Endereco enderecoPresencial) {
		this.enderecoPresencial = enderecoPresencial;
	}

	@Override
	public String toString() {
		return "TurmaPresencial [enderecoPresencial=" + enderecoPresencial + "]";
	}

}
