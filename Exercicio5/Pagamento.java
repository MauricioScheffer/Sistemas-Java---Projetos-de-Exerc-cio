package Exercicio5;

public class Pagamento {
	protected double valor;
	protected String descricao;
	
	public Pagamento(double valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public void processarPagamento() {
		System.out.println("Valor do Pagamento R$" + valor);
	}

	public void processarPagamento(boolean comTaxa) {
		if(comTaxa == true) {
			System.out.println("Valor do Pagamento com Taxa R$" + valor + 5);
		}else {
			processarPagamento();
		}
	}
	
	
}
