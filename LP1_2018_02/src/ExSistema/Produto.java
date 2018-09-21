package ExSistema;

public abstract class Produto {
	private String descricao, cor, material, marca;
	private double valorUnit;
	
	public Produto(String descricao, double valorUnit) {
		this.descricao = descricao;
		this.valorUnit = valorUnit;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", cor=" + cor + ", material=" + material + ", marca=" + marca
				+ ", valorUnit=" + valorUnit + "]";
	}

}
