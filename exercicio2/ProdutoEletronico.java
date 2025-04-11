package exercicio2;

public class ProdutoEletronico extends Produto {
	protected boolean garantiaEstendida;

	public ProdutoEletronico(String nome, double preco, String descricao, int estoque, boolean garantiaEstendida) {
		super(nome, preco, descricao, estoque);
		this.garantiaEstendida = garantiaEstendida;
	}
	
	@Override
	public double calcularPrecoFinal() {
		if(garantiaEstendida == true) {
			return 1.15 * (preco * estoque);
		}
		return preco * estoque;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Informações Básicas"
				+ "\nProduto: " + nome +
				"\nPreço: " + preco +
				"\nDescrição: " + descricao);
		if(garantiaEstendida == true) {
			System.out.println("\nGarantia Estendida: Possui");
		}else {
			System.out.println("\nGarantia Estendida: Não Possui");
		}
	}
	
	
	
	
}
