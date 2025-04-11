package exercicio2;

public class Produto {
	protected String nome;
	protected double preco;
	protected String descricao;
	protected int estoque;
	
	public Produto() {
		this.nome = "";
		this.preco = 0.0;
		this.descricao = "";
		this.estoque= 0;
	}
	
	public Produto(String nome, double preco, String descricao, int estoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.estoque = estoque;
	}
	
	public double calcularPrecoFinal() {
		return preco * estoque;
	}
	
	public void exibirDetalhes() {
		System.out.println("Informações Básicas"
				+ "\nProduto: " + nome +
				"\nPreço: " + preco +
				"\nDescrição: " + descricao);
	}
	
	public void exibirDetalhes(boolean comEstoque) {
		if(comEstoque == true) {
		exibirDetalhes();
		System.out.println("Estoque: " + estoque);
		}else {
		exibirDetalhes();
		}
	}
	
	
	
	

}
