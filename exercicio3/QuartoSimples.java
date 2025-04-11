package exercicio3;

public class QuartoSimples extends Quarto {
	protected int ocupacaoMaxima;
	
	public QuartoSimples(int numerQuarto, double PrecoPorNoite, String tipo, int ocupacaoMaxima) {
		super(numerQuarto, PrecoPorNoite, tipo);
		this.ocupacaoMaxima = ocupacaoMaxima;
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Ocupação Máxima: " + ocupacaoMaxima);
	}
	
	
}
