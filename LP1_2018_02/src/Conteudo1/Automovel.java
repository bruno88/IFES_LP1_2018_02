package Conteudo1;

public class Automovel {
	private String chassi, cor, tipo, marca, tipoCombustivel;
	private double velocidadeAtual;
	private int numRodas;

	public Automovel(String cor, String marca, int numRodas) {
		this.cor = cor;
		this.marca = marca;
		this.numRodas = numRodas;
	}
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getNumRodas() {
		return numRodas;
	}

	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}

	public void acelerar(double i) {
		this.velocidadeAtual += i;

	}

	public void frear(double i) {
		this.velocidadeAtual -= i;

	}
	
	public void imprimeVelocidadeAtual() {
		System.out.println(this.getClass().getSimpleName() 
				+ " está a " + this.velocidadeAtual);
	}

	public void buzina() {
		System.out.println("MUUUUUU!!!!!!!!!!!");

	}

}
