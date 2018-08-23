package Conteudo1;

public class Animal {
	private String nome;
	private int idade;
	private double peso;

	public Animal(String nome) {
		this.nome = nome;
	}

	public Animal(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", idade=" + idade + ", peso=" + peso;
	}

}
