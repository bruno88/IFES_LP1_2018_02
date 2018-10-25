package GenericsEIterator;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import ExSistema.Produto;

public class ExemploConsultaGenerics {

	public static void main(String[] args) {
		Pessoa pessoaAtual;
		ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();

		// Pessoa 1
		String nome = "bruno";
		String RG = "q";
		String telefone = "w";
		String email = "e";
		Pessoa novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Pessoa 2
		nome = "pedro";
		RG = "a";
		telefone = "s";
		email = "d";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		// Pessoa 3
		nome = "maria";
		RG = "z";
		telefone = "x";
		email = "c";
		novaPessoa = new Pessoa(nome, RG, telefone, email);
		pessoasCadastradas.add(novaPessoa);

		Object obj = consultaPorCriterio(pessoasCadastradas, "maria");
		if (obj != null) {
			System.out.println(obj.toString());
		} else {
			System.out.println("N�o encontrado");
		}
	}

	private static Object consultaPorCriterio(ArrayList<?> 
	lista, String criterio) {
		Object objetoEncontrado = null;
		boolean encontrado = false;
		for (int i = 0; !encontrado && i < lista.size(); i++) {
			objetoEncontrado = lista.get(i);

			// Verifica��o do tipo da inst�ncia lida
			if (objetoEncontrado instanceof Conta) {
				Conta conta = (Conta) lista.get(i);
				if (conta.getCriterio().equalsIgnoreCase(criterio)) {
					encontrado = true;
					objetoEncontrado = lista.get(i);
				}

			} else if (objetoEncontrado instanceof Pessoa) {
				Pessoa pessoa = (Pessoa) lista.get(i);
				if (pessoa.getCriterio().equalsIgnoreCase(criterio)) {
					encontrado = true;
					objetoEncontrado = lista.get(i);
				}
			}
			else {
				System.out.println("Tipo n�o cadastrado");
			}

		}

		return objetoEncontrado;
	}
}
