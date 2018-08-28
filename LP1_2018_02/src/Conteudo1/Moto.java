package Conteudo1;

public class Moto extends Automovel {
	
	public Moto(String cor, String marca) {
		super(cor, marca, 2);
		
	}
	
	public Moto(String cor, String marca, int numRodas) {
		super(cor, marca, numRodas);
		
	}
	
	@Override
	public void buzina() {
		System.out.println("To passando no corredor !!!");
		super.buzina();
	}

}
