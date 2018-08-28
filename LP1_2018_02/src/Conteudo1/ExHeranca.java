package Conteudo1;

public class ExHeranca {
	public static void main(String[] args) {
		Carro carro1 = new Carro("preto", "fiat", 4);
		carro1.acelerar(100);
		carro1.frear(30);
		carro1.imprimeVelocidadeAtual();
		carro1.buzina();
		
		Moto moto1 = new Moto("azul", "yamaha");
		
		Automovel auto1 = new Automovel("verde", "ford", 4);
		
		auto1.acelerar(20);
		auto1.imprimeVelocidadeAtual();
		auto1.buzina();
		
		moto1.imprimeVelocidadeAtual();
		moto1.buzina();
	}

}
