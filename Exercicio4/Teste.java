package Exercicio4;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notificacao n = new Notificacao("bla bla", "maumau");
		EmailNotificacao e = new EmailNotificacao("blu blu", "Joaozinho", "a@a.com");
		SmsNotificacao s = new SmsNotificacao("bli bli", "rafa", "123456789");
		
		n.enviar("SAP");
		System.out.println();
		e.enviar("Vagas");
		System.out.println();
		s.enviar();
		
	}

}
