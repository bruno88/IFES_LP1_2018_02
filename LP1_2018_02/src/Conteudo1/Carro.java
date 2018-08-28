package Conteudo1;

public class Carro extends Automovel {
	private String tipoDirecao;
	private boolean arCondicionado, vidroEletrico;
	private int numPortas;

	public Carro(String cor, String marca, int numPortas) {
		super(cor, marca, 4);
		this.numPortas = numPortas;
	}
	
	

	public String getTipoDirecao() {
		return tipoDirecao;
	}



	public void setTipoDirecao(String tipoDirecao) {
		this.tipoDirecao = tipoDirecao;
	}



	public int getNumPortas() {
		return numPortas;
	}



	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}



	public boolean isArCondicionado() {
		return arCondicionado;
	}



	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}



	public boolean isVidroEletrico() {
		return vidroEletrico;
	}



	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
