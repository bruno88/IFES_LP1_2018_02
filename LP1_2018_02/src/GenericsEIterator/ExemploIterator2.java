package GenericsEIterator;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import Interfaces.IWritable;

public class ExemploIterator2 {

	public static void main(String[] args) {
		// Iterator itPessoas, itContas;
		Iterator<?> it;
		ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
		ArrayList<Conta> contasCadastradas = new ArrayList<Conta>();

		// Adicionando Pessoa 1
		String nome = "bruno";
		String RG = "q";
		String telefone = "w";
		String email = "e";
		Pessoa novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Adicionando Pessoa 2
		nome = "pedro";
		RG = "a";
		telefone = "s";
		email = "d";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Adicionando Pessoa 3
		nome = "maria";
		RG = "z";
		telefone = "x";
		email = "c";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Conta 1
		Conta c1 = new Conta(novaPessoa);
		contasCadastradas.add(c1);

		it = pessoasCadastradas.iterator();
		// TODO: bagunçar pessoasCadastradas 
		removePorNome(it, "bruno");

		it = contasCadastradas.iterator();
		removePorNome(it, "maria");

		// No final, imprime toda a lista, para testes
		it = pessoasCadastradas.iterator();
		
		// reconhecendo classes em tempo de execução
		reconheceTipoClasse(Conta.class);
/*
		// imprimindo tudo
		JOptionPane.showMessageDialog(null, "Imprimindo Pessoas");
		imprimirTudo(it);
		it = contasCadastradas.iterator();
		JOptionPane.showMessageDialog(null, "Imprimindo Contas");
		imprimirTudo(it);*/
	}

	public static void reconheceTipoClasse ( 
			Class<?> tipo) {
		if (tipo == Conta.class) {
			System.out.println("Conta");
		} else if (tipo == Pessoa.class) {
			System.out.println("Pessoa");
		} else {
			System.out.println("Outra coisa");
		}
	}
	// Usando Generics para imprimir tudo
	public static void imprimirTudo(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			JOptionPane.showMessageDialog(null, iterator.next());
		}
	}

	// Usando Generics para remover por nome
	public static void removePorNome(Iterator<?> iterator, 
			String criterio) {
		while (iterator.hasNext()) {
			Object o1 = iterator.next();
			if (o1.toString().contains(criterio)) {
				iterator.remove();
			}
		}
	}

}
