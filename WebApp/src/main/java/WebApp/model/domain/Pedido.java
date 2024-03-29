package WebApp.model.domain;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
	private int id;
	private Map<Integer, Produto> itens;
	private Cliente cliente;
	private Double valorTotal;

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", itens=" + itens + ", cliente=" + cliente + ", valorTotal=" + valorTotal + "]";
	}

	public Pedido() {
		itens = new HashMap<>();
	}

	public Pedido(int id) {
		this();
		this.id = id;
	}

	public Pedido(int id, Map<Integer, Produto> itens, Cliente cliente) {
		this.id = id;
		this.itens = itens;
		this.cliente = cliente;
		this.valorTotal = calcularTotal();
	}

	public double calcularTotal() {
		double total = 0;
		for (Produto item : itens.values()) {
			total += item.getPreco();
		}
		setValorTotal(total);
		return total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, Produto> getItens() {
		return itens;
	}

	public void setItens(Map<Integer, Produto> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}
	//--
    public void adicionarItem(int idItem, Produto produto) {
        itens.put(idItem, produto);
        calcularTotal();
    }

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
