package Exercicio6;

public class Teste {

	public static void main(String[] args) {
		Conteudo conteudo = new Conteudo("Bela e a Fera", "Uma princesa que conhece um monstro");
		conteudo.exibirDetalhes(true);
		
		System.out.println();
		
		VideoAula videoAula = new VideoAula("Aprenda JAVA", "Aprendendo java do júnior ao sênior", 5);
		videoAula.exibirDetalhes();
		
		System.out.println();
		
		Artigo art = new Artigo("Artigo sobre o século XX", "Estudando tudo sobre essa nova era", 2000);
		art.exibirDetalhes();

	}

}
