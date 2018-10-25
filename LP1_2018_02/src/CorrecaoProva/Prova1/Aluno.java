package CorrecaoProva.Prova1;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	private int numMatricula;
	private String dataMatricula;
	private ArrayList<Endereco> enderecos = 
			new ArrayList<Endereco>();

	public Aluno(String nome, String sexo, int idade, 
			int numMatricula, String dataMatricula, 
			Endereco endereco) {
		super(nome, sexo, idade);
		this.numMatricula = numMatricula;
		this.dataMatricula = dataMatricula;
		// Adicionando o endereço obrigatório
		this.enderecos.add(endereco);
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	public void addEndereco(Endereco e1) {
		this.enderecos.add(e1);
	}

	public String getStringEnderecos() {
		String result = "Lista de endereços de " + this.getNome() + ": \n";
		for (Endereco endereco : enderecos) {
			result += endereco.toString();
		}
		return result;
	}
	
	public String getTurmas() {
		return ControleTurmas.getTurmasPorAluno(this);
	}

	@Override
	public String toString() {
		return "Aluno [numMatricula=" + numMatricula + ", dataMatricula=" + dataMatricula + ", enderecos=" + enderecos
				+ "]";
	}

}
