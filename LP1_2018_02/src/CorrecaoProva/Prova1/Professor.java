package CorrecaoProva.Prova1;

import java.util.ArrayList;

public class Professor extends Funcionario {
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Professor(String nome, String sexo, int idade, int sIAPE, Disciplina disciplina) {
		super(nome, sexo, idade, sIAPE);
		addDisciplina(disciplina);
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void addDisciplina(Disciplina d1) {
		this.disciplinas.add(d1);
		d1.setProf(this);
	}
	public String getTurmas() {
		return ControleTurmas.getTurmasPorProfessor(this);
	}

	@Override
	public String toString() {
		return "Professor [disciplinas=" + disciplinas + "]";
	}
	
	
}
