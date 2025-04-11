package exercicio1;

public class Vendedor extends Funcionario{
	protected double vendasMensais;
	protected double comissaoPercentual = 0.05;
	
	public Vendedor(String nome, String cargo, String departamento, double salarioBase, double vendasMensais) {
		super(nome, cargo, departamento, salarioBase);
		this.vendasMensais = vendasMensais;
	}
	
	@Override
	public double calcularSalario() {
		return salarioBase + (vendasMensais * ( 1 + comissaoPercentual));
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Comissão: " + calcularSalario());
	}
}
