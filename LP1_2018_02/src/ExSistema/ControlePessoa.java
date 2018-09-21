package ExSistema;

import java.util.ArrayList;

public class ControlePessoa {
	private static ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();

	// Modo 1: separando as classes
	public static void addFuncionario(Funcionario novoFuncionario) {
		pessoasCadastradas.add(novoFuncionario);
	}

	public static void addCliente(Cliente novaPessoa) {
		pessoasCadastradas.add(novaPessoa);
	}

	public static void addEstilista(Estilista novoEstilista) {
		pessoasCadastradas.add(novoEstilista);
	}

	// Modo 2: Usando a superclasse
	public static void addPessoa(Pessoa novaPessoa) {
		pessoasCadastradas.add(novaPessoa);
	}

	public static Pessoa getPessoa(String nome) {
		Pessoa pessoa = null;
		boolean encontrado = false;
		for (int i = 0; !encontrado && i < pessoasCadastradas.size(); i++) {
			if (pessoasCadastradas.get(i).getNome().equalsIgnoreCase(nome)) {
				encontrado = true;
				pessoa = pessoasCadastradas.get(i);
			}
		}

		return pessoa;
	}

	public static String toStringAll() {
		String result = "Pessoas cadastradas:\n";
		for (int i = 0; i < pessoasCadastradas.size(); i++) {
			result += pessoasCadastradas.get(i).getNome() + "\n";
		}
		return result;
	}

}
