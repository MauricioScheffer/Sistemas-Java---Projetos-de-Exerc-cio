package Exercicio4;

public class Notificacao {
	protected String mensagem;
	protected String destinatario;
	
	public Notificacao() {
		this.mensagem = "";
		this.destinatario = "";
	}
	
	public Notificacao(String mensagem, String destinatario) {
		super();
		this.mensagem = mensagem;
		this.destinatario = destinatario;
	}
	
	public void enviar() {
		System.out.println("Mensagem Enviada!\n" + mensagem + "\n" + destinatario);
	}
	
	public void enviar(String assunto) {
		enviar();
		System.out.println("Assunto: " + assunto);
	}
	
	
}
