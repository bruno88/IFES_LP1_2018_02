package CorrecaoProva.Prova1;

public class Disciplina {
	private String nome;
	private Professor prof;
	
	public Disciplina(String nome) {
		this.nome = nome;
	}
	
	public Disciplina(String nome, Professor prof) {
		this.nome = nome;
		this.prof = prof;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}
	
	public String getTurmasAbertas() {
		return ControleTurmas.getTurmasPorDisciplina(this);
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", prof=" + prof + "]";
	}
	
	
	
	
}
