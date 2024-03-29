package WebApp.model.domain;

public class Produto {
    private int id;
    private String nome;
    private String validade;
    private Float preco;
    
 
   
	public Produto(int id, String nome, String validade) {
		
        this.id = id;
        this.nome = nome;
        this.validade = validade;
    }
	

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
    
}

