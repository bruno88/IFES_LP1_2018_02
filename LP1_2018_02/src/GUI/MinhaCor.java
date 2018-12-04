package GUI;

public enum MinhaCor {
	AZUL(1), 
	VERMELHO(2), 
	VERDE(3), 
	ROSA(4), 
	MARROM(5),
	PRETO (6),
	OCRE (7),
	CASTANHO(8);

	public int valorEnum;

	MinhaCor(int valor) {
		this.valorEnum = valor;
	}
	
	public int getValor() {
		return this.valorEnum;
	}
	
	public void setValor(int codigo) {
		this.valorEnum = codigo;
	}
}
