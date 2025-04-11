package Exercicio4;

public class EmailNotificacao extends Notificacao{
	protected String enderecoEmail;
	
	
	public EmailNotificacao() {
		super();
	}
	
	public EmailNotificacao(String mensagem, String destinatario, String enderecoEmail) {
		super();
		this.enderecoEmail = enderecoEmail;
	}
	
	@Override
	public void enviar() {
		System.out.println("Email enviado para " + enderecoEmail);
	}
	
	public void enviar(String assunto) {
		enviar();
		System.out.println("Assunto: " + assunto);
	}
	
}
