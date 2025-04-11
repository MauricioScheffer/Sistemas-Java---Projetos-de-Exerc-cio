package Exercicio4;

public class SmsNotificacao extends Notificacao{
	protected String numeroTelefone;
	
	public SmsNotificacao(String mensagem, String destinatario, String numeroTelefone) {
		super();
		this.numeroTelefone = numeroTelefone;
	}
	
	@Override
	public void enviar() {
		System.out.println("SMS Enviado Com Sucesso pelo " + numeroTelefone);
	}
}
