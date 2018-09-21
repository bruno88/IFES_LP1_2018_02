package ExSistema;

public abstract class Pessoa {
	private String nome, CPF, nacionalidade;
	private int idade;
	private double altura, peso;

	// TODO: Seria interessante ter medidas,
	// mas não sei como funciona

	public Pessoa(String nome, String CPF, String nacionalidade, int idade, double altura, double peso) {
		this.nome = nome;
		this.CPF = CPF;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + ", nacionalidade=" + nacionalidade + ", idade=" + idade
				+ ", altura=" + altura + ", peso=" + peso + "]";
	}

}
