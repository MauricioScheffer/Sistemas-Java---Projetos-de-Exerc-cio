package exercicio1;

public class Teste {

	public static void main(String[] args) {
		Funcionario F = new Funcionario("Eduardo Klaus", "Limpeza" ,"Todos", 1800);
		Gerente G = new Gerente("Mauricio Scheffer", "Gerente" ,"Vendas", 5000);
		Vendedor V = new Vendedor("Wesley", "Torneiro", "Torneira", 1800, 10);
		
		F.exibirInformacoes("Bom Funcionário");;
		System.out.println();
		
		G.exibirInformacoes("Mal funcionário");
		System.out.println();
		
		V.exibirInformacoes("Melhor Funcionário");
		

	}

}
