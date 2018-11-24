package Interfaces;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente
				(new Pessoa("Bruno", "1234", 
						"3333", "a@b", 28));
		cc1.realizarSaque(10);
		testaSaque(cc1, 100);
		ContaPoupanca cp1 = new ContaPoupanca
				(new Pessoa("Ana", "1234", 
						"3333", "a@b", 28));
		testaSaque(cp1, 100);
	}
	
	public static void testaSaque (
			IOperavel obj, double valor) {
		obj.realizarSaque(valor);
		
	}
}
