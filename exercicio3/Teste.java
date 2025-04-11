package exercicio3;

public class Teste {

	public static void main(String[] args) {
		Quarto quarto = new Quarto(45, 50.00, "Normal");
		QuartoSimples quartoSimples = new QuartoSimples(39, 25.00, "Simples", 2);
		Suite suite = new Suite(20, 100.00, "Suite", "Comidas, Bebida, TV");
		
		quarto.exibirInformacoes();
		System.out.println();
		quarto.exibirInformacoes(true);
		System.out.println();
		
		quartoSimples.exibirInformacoes(false);
		System.out.println();
		
		suite.exibirInformacoes();
		
	}

}
