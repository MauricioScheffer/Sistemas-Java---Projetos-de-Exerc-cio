package Exercicio6;

public class Conteudo {
	protected String titulo;
	protected String descricao;
	
	public Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public void exibirDetalhes() {
		System.out.println("Título: " + titulo);
	}
	
	public void exibirDetalhes(boolean comResumo) {
		if(comResumo == true) {
		System.out.println("Título: " + titulo+
				"\nDescrição: " + descricao);
		}else {
			exibirDetalhes();
		}

	}
	
}
