package Exercicio6;

public class VideoAula extends Conteudo {
	protected int duracao;

	public VideoAula(String titulo, String descricao, int duracao) {
		super(titulo, descricao);
		this.duracao = duracao;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Título: " + titulo);
		System.out.println("Descrição: " + descricao);
		System.out.println("Duração: " + duracao);
	}
	
	
}
