package Exercicio5;

public class PagamentoBoleto extends Pagamento{
	protected String codigoBarras;

	public PagamentoBoleto(double valor, String descricao, String codigoBarras) {
		super(valor, descricao);
		this.codigoBarras = codigoBarras;
	}
	
	@Override
	public void processarPagamento() {
        valor += 5.00; // Taxa fixa de R$5,00
        System.out.println("Pagamento de R$ " + valor + " realizado via boleto. Código de barras: " + codigoBarras);
    }

    public void processarPagamento(boolean comDesconto) {
        if (comDesconto) {
            System.out.println("Pagamento com desconto no valor R$ " + valor);
        } else {
            processarPagamento();
        }
    }
}
