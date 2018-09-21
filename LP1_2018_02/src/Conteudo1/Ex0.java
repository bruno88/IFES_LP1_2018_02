package Conteudo1;

import java.util.ArrayList;

public class Ex0 {
	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa
				("bruno", "123", "3333", "a@gmail.com", 19);
		Pessoa p2 = new Pessoa
				("pedro", "123", "3333", "a@gmail.com", 19);
		Pessoa p3 = new Pessoa
				("alberto", "123", "3333", "a@gmail.com", 19);
		Pessoa p4 = new Pessoa
				("maria", "123", "3333", "a@gmail.com", 19);

		pessoas.add(p2);
		pessoas.add(p4);
		pessoas.add(p1);
		pessoas.add(p3);

		Pessoa p5 = new Pessoa("paulo", "123", "3333", "a@gmail.com", 19);
		
		if (pessoas.contains(p4)) {
			System.out.println("P4 está na lista");
		} else {
			System.out.println("P4 NÃO está na lista");
		}

		int pos = pessoas.indexOf(p4);
		System.out.println(pos);

		pessoas.add(2, p5);
		System.out.println(pessoas.toString());
		
		// For tradicional
		/*for (int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i).getNome());
			
		}*/

		// For each
		/*for (Pessoa pessoaAtual : pessoas) {
			System.out.println(pessoaAtual.getNome());
		}*/
		
		
		Pessoa[] vetorNovo = { p1, p2, p3, p4, p5 };
		p1.getEmail();
		
		
		for (Pessoa pessoaAtual : vetorNovo) {
			System.out.println(pessoaAtual.getNome());
		}
		
		//Conta c1 = new Conta (p1);
		//pessoas.add(c1);
		
		for (Object coisa : pessoas) {
			System.out.println(coisa.getClass());
			
		}
		
	}
}
