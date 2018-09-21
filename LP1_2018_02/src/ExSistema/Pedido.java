package ExSistema;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Pedido {
	private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
	private Pessoa comprador;
	private Date dataCompra;
	private int num;

	public Pedido(Pessoa comprador, int num) {
		this.comprador = comprador;
		// TODO: Alterar num para ControlePessoa.qtdPessoas;
		this.num = num;
		Calendar c = Calendar.getInstance();
		this.dataCompra = c.getTime();
	}

	public Pessoa getComprador() {
		return comprador;
	}

	public void setComprador(Pessoa comprador) {
		this.comprador = comprador;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public ArrayList<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}

	public void addItem(int quantidade, Produto prod) {
		ItemPedido item = new ItemPedido(quantidade, prod);
		itens.add(item);

	}

	public String toStringAll() {
		String result = "Itens do pedido " + this.num + ":\n";
		for (int i = 0; i < itens.size(); i++) {
			ItemPedido item1 = itens.get(i);
			result += item1.getProduto().getDescricao() +
					" Qtd. = " + item1.getQuantidade() +
					" => Total: "+ item1.getSubTotal() +"\n";
		}
		result += "\nValor final do pedido = " + getValorTotal(); 
		return result;

	}
	
	public double getValorTotal() {
		double valorTotal = 0;
		for (int i = 0; i < itens.size(); i++) {
			valorTotal += itens.get(i).getSubTotal();
		}
		return valorTotal;

	}
	@Override
	public String toString() {
		return "Pedido [itens=" + itens + ", comprador=" + comprador + ", dataCompra=" + dataCompra + ", num=" + num
				+ "]";
	}

}
