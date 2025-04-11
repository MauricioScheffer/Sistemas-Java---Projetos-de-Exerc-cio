package Exercicio6;

public class Artigo extends Conteudo {
	protected int numeroPalavras;

	public Artigo(String titulo, String descricao, int numeroPalavras) {
		super(titulo, descricao);
		this.numeroPalavras = numeroPalavras;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Título: " + titulo);
		System.out.println("Descrição: " + descricao);
		System.out.println("Número de Palavras: " + numeroPalavras);
	}
}
