package ExSistema;

import java.util.ArrayList;

public class ControleProduto {
	private static ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();

	// Modo 2: Usando a superclasse
	public static void addProduto(Produto p1) {
		produtosCadastrados.add(p1);
	}

	public static Produto getProduto(String nome) {
		Produto prod = null;
		boolean encontrado = false;
		for (int i = 0; !encontrado && i < produtosCadastrados.size(); i++) {
			if (produtosCadastrados.get(i).getDescricao().equalsIgnoreCase(nome)) {
				encontrado = true;
				prod = produtosCadastrados.get(i);
			}
		}

		return prod;
	}

	public static String toStringAll() {
		String result = "Produtos cadastrados:\n";
		for (int i = 0; i < produtosCadastrados.size(); i++) {
			result += produtosCadastrados.get(i).getDescricao() + "\n";

		}
		return result;
	}

}
