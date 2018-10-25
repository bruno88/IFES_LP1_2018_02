package CorrecaoProva.Prova1;

import java.util.ArrayList;

public class ControleTurmas {

	private static ArrayList<Turma> turmas = new ArrayList<Turma>();

	public static void addTurma(Turma turma) {
		turmas.add(turma);
	}

	public static String getTurmasPorAluno(Aluno aluno) {
		String result = "";
		for (Turma turma : turmas) {
			if (turma.isMatriculado(aluno)) {
				result += aluno.getNome() + " está matriculado(a) na turma de " + turma.getDisciplinaLecionada().getNome() + "\n";
			}
		}
		return result;
	}
	
	public static String getTurmasPorProfessor(Professor prof) {
		String result = "";
		for (Turma turma : turmas) {
			if (turma.isLecionada(prof)) {
				result += prof.getNome() + " está lecionando na turma de " + turma.getDisciplinaLecionada().getNome() + "\n";
			}
		}
		return result;
	}

	public static String getTurmasPorDisciplina(Disciplina disciplina) {
		String result = "";
		for (Turma turma : turmas) {
			if (turma.getDisciplinaLecionada() == disciplina) {
				result += "Há uma turma aberta de " + turma.getDisciplinaLecionada().getNome() + "\n";
			}
		}
		return result;
		
	}
}
