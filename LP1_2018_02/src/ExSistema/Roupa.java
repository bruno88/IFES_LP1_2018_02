package ExSistema;

public class Roupa extends Produto {
	private String tamanho, colecao;
	private Estilista estilista;
	

	public Roupa(String tamanho, Estilista estilista, String descricao, double valorUnit) {
		super(descricao, valorUnit);
		this.tamanho = tamanho;
		this.estilista = estilista;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getColecao() {
		return colecao;
	}

	public void setColecao(String colecao) {
		this.colecao = colecao;
	}

	public Pessoa getEstilista() {
		return estilista;
	}

	public void setEstilista(Estilista estilista) {
		this.estilista = estilista;
	}

	@Override
	public String toString() {
		return "Roupas [tamanho=" + tamanho + ", colecao=" + colecao + ", estilista=" + estilista + "]";
	}

}
