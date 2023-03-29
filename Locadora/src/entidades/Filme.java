package entidades;

public class Filme {
	private String nome;
	private int estoque;
	private Double precoLocacao;
	
	public Filme() {
	}
	
	public Filme(String nome, Integer estoque, Double precoLocacao){
		this.nome = nome;
		this.estoque = estoque;
		this.precoLocacao = precoLocacao; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Double getPrecoLocacao() {
		return precoLocacao;
	}

	public void setPrecoLocacao(Double precoLocacao) {
		this.precoLocacao = precoLocacao;
	}
	

}
