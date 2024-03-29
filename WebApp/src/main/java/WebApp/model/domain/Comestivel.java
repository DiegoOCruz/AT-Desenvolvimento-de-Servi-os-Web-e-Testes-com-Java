package WebApp.model.domain;

public class Comestivel extends Produto {
	private String tipo;
	private Float precoCompra;
	private Float precoVenda;

	@Override
	public String toString() {
		return "Nome=" + getNome() + ", preço=" + getPrecoVenda();
	}

	public Float calcValorVenda(Float precoCompra) {
		Float valorFinal = precoCompra * 3;
		setPreco(valorFinal);
		return valorFinal;
	}
	public Comestivel(int id, String nome, String validade, String tipo) {
		super(id, nome, validade);
		this.tipo = tipo;
	}
	
	public Comestivel(int id, String nome, String validade, String tipo, Float precoCompra) {
		this(id, nome, validade, tipo);
		this.precoCompra = precoCompra;
		this.precoVenda = calcValorVenda(precoCompra);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(Float precoCompra) {
		this.precoCompra = precoCompra;
	}

	public Float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Float precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	

}
