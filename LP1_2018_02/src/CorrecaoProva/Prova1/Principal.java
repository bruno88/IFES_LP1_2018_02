package CorrecaoProva.Prova1;

public class Principal {
	public static void main(String[] args) {
		// Crie alguns alunos, professores e FuncionarioAdministrativo para serem utilizados.
		//// Criando endereços para serem usados no cadastro de Pessoas
		Endereco e1 = new Endereco("Rua sem nome", "casa", "Lugar Nenhum", "Ninguém Viu", "ES", "1234");
		ControleEndereco.addEndereco(e1);
		Endereco e2 = new Endereco("Rua sem nome", "casa", "Lugar Nenhum", "Ninguém Viu", "ES", "1234");
		ControleEndereco.addEndereco(e2);
		Endereco e3 = new Endereco("Rua sem nome", "casa", "Lugar Nenhum", "Ninguém Viu", "ES", "1234");
		ControleEndereco.addEndereco(e3);
		
		//// Criando Disciplinas para serem usados no cadastro de Professores
		Disciplina d1 = new Disciplina("Projeto de Sistemas");
		ControleDisciplinas.addDisciplina(d1);
		Disciplina d2 = new Disciplina("Redes de Computadores");
		ControleDisciplinas.addDisciplina(d2);
		Disciplina d3 = new Disciplina("TPA");
		ControleDisciplinas.addDisciplina(d3);
		Disciplina d4 = new Disciplina("Linguagem de Programação I");
		ControleDisciplinas.addDisciplina(d4);
		
		//// Criando as pessoas
		////// Criando Alunos
		Aluno a1 = new Aluno("ana", "F", 27, 3, "27/09/2018", e1);
		ControlePessoas.addPessoa(a1);
		Aluno a2 = new Aluno("breno", "M", 28, 4, "27/09/2018", e1);
		ControlePessoas.addPessoa(a2);
		Aluno a3 = new Aluno("caio", "M", 29, 12, "27/09/2018", e2);
		ControlePessoas.addPessoa(a3);
		Aluno a4 = new Aluno("Dudu", "M", 30, 13, "27/09/2018", e3);
		ControlePessoas.addPessoa(a4);
		
		////// Criando Professores
		Professor p1 = new Professor("bruno", "M", 28, 1234, d1);
		ControlePessoas.addPessoa(p1);
		Professor p2 = new Professor("anderson", "M", 28, 2345, d2);
		ControlePessoas.addPessoa(p2);
		Professor p3 = new Professor("archimedes", "M", 28, 3456, d3);
		ControlePessoas.addPessoa(p3);
		////// Adicionando uma disciplina extra pro bruno
		p1.addDisciplina(d4);
		
		////// Criando Adm
		FuncionarioAdm adm1 = new FuncionarioAdm("maria", "F", 30, 4567, "RH"); 
		ControlePessoas.addPessoa(adm1);
		// Além dos Endereços criados para instanciar as pessoas, crie um endereço e o adicione no cadastro de um dos alunos.
		a1.addEndereco(e3);
		
		// Crie 2 Disciplinas diferentes. (Feitos lá em cima)
		
		// Cria pelo menos 3 turmas. Para uma das disciplinas, cria uma turma presencial. Para a outra disciplina crie uma turma presencial e uma EaD.
		TurmaPresencial presencial1 = new TurmaPresencial(d1, e1);
		ControleTurmas.addTurma(presencial1);
		TurmaPresencial presencial2 = new TurmaPresencial(d3, e1);
		ControleTurmas.addTurma(presencial2);
		TurmaEaD EaD1 = new TurmaEaD(d1);
		ControleTurmas.addTurma(EaD1);
		
		// Adicionando alunos em turmas
		presencial1.addAluno(a1);
		presencial1.addAluno(a2);
		presencial1.addAluno(a3);
		presencial1.addAluno(a4);
		presencial2.addAluno(a1);
		EaD1.addAluno(a1);
		EaD1.addAluno(a2);
		EaD1.addAluno(a3);
		// Faça o teste dos métodos propostos no exercício.
		System.out.println(a1.getTurmas());
		System.out.println(p1.getTurmas());
		System.out.println(d3.getTurmasAbertas());
		System.out.println(EaD1.getAlunos());
	}
}
