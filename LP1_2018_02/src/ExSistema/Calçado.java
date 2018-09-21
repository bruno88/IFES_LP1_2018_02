package ExSistema;

public class Cal�ado extends Produto {
	private int numeracao;

	public Cal�ado(String descricao, double valorUnit, int numeracao) {
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
		return "Cal�ados [numeracao=" + numeracao + "]";
	}

}
