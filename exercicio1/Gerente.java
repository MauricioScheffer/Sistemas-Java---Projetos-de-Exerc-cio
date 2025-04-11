package exercicio1;

public class Gerente extends Funcionario {
	private double bonusPercentual = 0.20;
	
	public Gerente(String nome, String cargo, String departamento, double salarioBase) {
		super(nome, cargo, departamento, salarioBase);
	}
	
	@Override
	public double calcularSalario() {
		return salarioBase * ( 1 + bonusPercentual);
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Salário com bônus de 20%: " + calcularSalario());
	}
	
	
	
	
}
