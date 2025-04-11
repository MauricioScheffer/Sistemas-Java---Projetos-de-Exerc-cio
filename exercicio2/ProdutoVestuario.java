package exercicio2;

public class ProdutoVestuario extends Produto {
	protected String tamanho;
	protected boolean emPromocao;
	
	
	public ProdutoVestuario(String nome, double preco, String descricao, int estoque, String tamanho, boolean emPromocao) {
		super(nome, preco, descricao, estoque);
		this.tamanho = tamanho;
		this.emPromocao = emPromocao;
	}
	
	@Override
	public double calcularPrecoFinal() {
		if(emPromocao == true) {
			return 0.10 * (preco * estoque); 
		}
		return preco * estoque;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Informações Básicas"
				+ "\nProduto: " + nome +
				"\nPreço: " + preco +
				"\nDescrição: " + descricao);
				if(emPromocao == true) {
					System.out.println("\nEm Promoção: Está!!!");
				}else {
					System.out.println("\nEm Promoção: Não está");
				}
	}
	
}
