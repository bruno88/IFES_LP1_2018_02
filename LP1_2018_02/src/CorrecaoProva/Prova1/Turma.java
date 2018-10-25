package CorrecaoProva.Prova1;

import java.util.ArrayList;

public abstract class Turma {
	private ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
	private Disciplina disciplinaLecionada;

	public Turma(Disciplina disciplinaLecionada) {
		this.disciplinaLecionada = disciplinaLecionada;
	}

	public ArrayList<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public Disciplina getDisciplinaLecionada() {
		return disciplinaLecionada;
	}

	public void setDisciplinaLecionada(Disciplina disciplinaLecionada) {
		this.disciplinaLecionada = disciplinaLecionada;
	}

	public void addAluno(Aluno a1) {
		this.alunosMatriculados.add(a1);
	}

	public String getAlunos() {
		String result = "Lista de alunos da turma de " + this.disciplinaLecionada.getNome() + ":\n";
		for (Aluno aluno : alunosMatriculados) {
			result += aluno.getNome() + "\n";
		}
		return result;
	}
	
	public boolean isMatriculado(Aluno aluno) {
		boolean encontrou = false;
		for (int i = 0; !encontrou && i < alunosMatriculados.size(); i++) {
			if(alunosMatriculados.get(i) == aluno) {
				encontrou = true;
			}
		}
		return encontrou;
	}
	
	public boolean isLecionada(Professor prof) {

		if (this.disciplinaLecionada.getProf() == prof) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Turma [alunosMatriculados=" + alunosMatriculados + ", disciplinaLecionada=" + disciplinaLecionada + "]";
	}

}
