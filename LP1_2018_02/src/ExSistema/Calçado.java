package ExSistema;

public class Calçado extends Produto {
	private int numeracao;

	public Calçado(String descricao, double valorUnit, int numeracao) {
		super(descricao, valorUnit);
		this.numeracao = numeracao;

	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}

	@Override
	public String toString() {
		return "Calçados [numeracao=" + numeracao + "]";
	}

}
