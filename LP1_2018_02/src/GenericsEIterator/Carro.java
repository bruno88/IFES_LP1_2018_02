package GenericsEIterator;

public class Carro extends MeuObjeto {
	private String placa;
	
	public Carro(String placa) {
		this.placa = placa;
	}
	@Override
	public String getCriterio() {
		return this.placa;
	}
	@Override
	public String toString() {
		return "Carro (" + placa + ")";
	}
	
	

}
