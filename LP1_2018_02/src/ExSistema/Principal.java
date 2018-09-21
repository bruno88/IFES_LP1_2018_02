package ExSistema;

public class Principal {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("João", "1234", "Brasileiro", 19, 1.77, 65, "111", "Vendedor", 1000);
		ControlePessoa.addPessoa(func1);
		Cliente cliente1 = new Cliente("Pedro", "4321", "Brasileiro", 19, 1.77, 65, "pedro123");
		ControlePessoa.addPessoa(cliente1);
		Estilista estilista1 = new Estilista("Ana", "1324", "Brasileiro", 19, 1.77, 65, "conservador nacional");
		ControlePessoa.addPessoa(estilista1);

		System.out.println(ControlePessoa.toStringAll());

		Roupa roupaP = new Roupa("P", estilista1, "Camisa Polo Azul P", 80);
		Roupa roupaM = new Roupa("M", estilista1, "Camisa Polo Azul M", 80);
		Roupa roupaG = new Roupa("G", estilista1, "Camisa Polo Azul G", 80);
		Calçado calçado1 = new Calçado("Tenis futsal", 120, 38);
		
		ControleProduto.addProduto(roupaP);
		ControleProduto.addProduto(roupaM);
		ControleProduto.addProduto(roupaG);
		ControleProduto.addProduto(calçado1);
		
		System.out.println(ControleProduto.toStringAll());
		
		Pedido pedido1 = new Pedido(cliente1, 1);
		pedido1.addItem(5, roupaP);
		pedido1.addItem(10, roupaM);
		pedido1.addItem(3, calçado1);
		
		System.out.println(pedido1.toStringAll());
	}

}
