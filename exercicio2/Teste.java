package exercicio2;

public class Teste {

	public static void main(String[] args) {
		Produto P = new Produto("TV", 1000, "50 polegadas", 10);
		ProdutoEletronico PE = new ProdutoEletronico("E-book", 50.0, "Livro Digital", 5, false);
		ProdutoVestuario PV = new ProdutoVestuario("Camisa", 30.0, "Lacoste", 10, "M", false);
		
		P.exibirDetalhes(true);
		System.out.println();
		
		PE.exibirDetalhes();
		System.out.println();
		
		PV.exibirDetalhes();
	}

}
