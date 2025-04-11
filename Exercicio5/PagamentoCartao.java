package Exercicio5;

public class PagamentoCartao extends Pagamento{
	protected String numeroCartao;

	public PagamentoCartao(double valor, String descricao, String numeroCartao) {
		super(valor, descricao);
		this.numeroCartao = numeroCartao;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("Valor do Pagamento R$" + valor + "Número do Cartão: " + numeroCartao);
	}

}
