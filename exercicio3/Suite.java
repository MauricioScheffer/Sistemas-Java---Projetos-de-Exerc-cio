package exercicio3;

public class Suite extends Quarto{
	protected String servicoExtra;

	public Suite(int numeroQuarto, double precoPorNoite, String tipo, String servicoExtra) {
		super(numeroQuarto, precoPorNoite, tipo);
		this.servicoExtra = servicoExtra;
	}
	
	@Override
	public double calcularDiaria(int noites) {
		return super.calcularDiaria(noites) * 1.50;
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("\nServiços Extras: " + servicoExtra);
	}
	
}
