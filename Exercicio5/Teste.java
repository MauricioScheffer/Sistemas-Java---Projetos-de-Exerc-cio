package Exercicio5;

public class Teste {

	public static void main(String[] args) {
		Pagamento pagamento = new Pagamento(50, "Plano de Saúde");
		pagamento.processarPagamento(true);
		
		PagamentoCartao cartao = new PagamentoCartao(50, "Plano de Saúde A", "12345");
		cartao.processarPagamento(true);
		
		PagamentoBoleto boleto1 = new PagamentoBoleto(30, "Plano de Saúde B", "123456789");
		boleto1.processarPagamento();
		
		PagamentoBoleto boleto2 = new PagamentoBoleto(30, "Plano de Saúde D", "123456789");
		boleto2.processarPagamento(true);
		
		
		
		
	}

}
