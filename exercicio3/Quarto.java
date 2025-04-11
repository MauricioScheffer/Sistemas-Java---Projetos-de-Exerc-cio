package exercicio3;

public class Quarto {
	protected int numeroQuarto;
	protected double precoPorNoite;
	protected String tipo;
	
	public Quarto(int numeroQuarto, double precoPorNoite, String tipo) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.precoPorNoite = precoPorNoite;
		this.tipo = tipo;
	}
	
	public double calcularDiaria(int noites) {
		return precoPorNoite*noites;
	}
	
	public void exibirInformacoes() {
		System.out.print("Informações do Quarto: "
				+ "\nNúmero:" +numeroQuarto +
				"\nTipo: " + tipo);
	}
	
	public void exibirInformacoes(boolean comPreco) {
		exibirInformacoes();
		if(comPreco == true) {
			System.out.println("\nPreço: " + precoPorNoite);
		} else {
			System.out.println("\nPreço: " + precoPorNoite);
		}
	}
}
