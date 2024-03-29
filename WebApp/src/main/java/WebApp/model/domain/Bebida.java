package WebApp.model.domain;

public class Bebida extends Produto {
    private String tipo;
    private Boolean alcolico;
    private Float precoCompra;
    private Float precoVenda;
    
    
    
    @Override
    public String toString() {
        return "Nome=" + getNome() + ", preço=" + getPrecoVenda();
    }
    
    public Float calcValorVenda(Float precoCompra) {
    	Float valorFinal = precoCompra*3;
    	setPreco(valorFinal);
    	return valorFinal;
    }

	public Bebida(int id, String nome, String validade) {
		super(id, nome, validade);
	}
	
	
	public Bebida(int id, String nome, String validade, String tipo, Boolean alcolico, Float precoCompra) {
		
		this(id, nome, validade);
		this.tipo = tipo;
		this.alcolico = alcolico;
		this.precoCompra = precoCompra;
		this.precoVenda = calcValorVenda(precoCompra);
		
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Boolean getAlcolico() {
		return alcolico;
	}
	public void setAlcolico(Boolean alcolico) {
		this.alcolico = alcolico;
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
