package Interfaces;

public abstract class SerVivo implements IWritable {
	private String nome;
	private int idade;
	private double altura, peso; 

	public SerVivo(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void respira() {
		System.out.println(this.nome +
				" está respirando profundamente!");

	}
}
