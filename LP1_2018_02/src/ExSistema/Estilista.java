package ExSistema;

public class Estilista extends Pessoa {
	private String estilo;

	public Estilista(String nome, String CPF, String nacionalidade, int idade, double altura, double peso,
			String estilo) {
		super(nome, CPF, nacionalidade, idade, altura, peso);
		this.estilo = estilo;
	}

	public String getMarcas() {
		return estilo;
	}

	public void setMarcas(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Estilista [estilo=" + estilo + "]";
	}
	
	
}
