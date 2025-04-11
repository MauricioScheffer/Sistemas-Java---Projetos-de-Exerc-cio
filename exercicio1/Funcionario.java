package exercicio1;

public class Funcionario {
	protected String nome;
	protected double salarioBase;
	protected String cargo;
	protected String departamento;
	
	public Funcionario() {
		this.nome = "";
		this.cargo = "";
		this.departamento = "";
		this.salarioBase = 0.0;
	}

	public Funcionario(String nome, String cargo, String departamento, double salarioBase) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.departamento = departamento;
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
		return salarioBase;
	}
	
	public void exibirInformacoes() {
		System.out.println("Informações Básicas: " +
				"\nNome:" + nome + 
				"\nCargo: " + cargo + 
				"\nDepartamento: " + departamento + 
				"\nSalário Base: " + salarioBase); 
	}
	
	public void exibirInformacoes(String adicional) {
		exibirInformacoes();
		System.out.println("Adicional: " + adicional);
	}
	


	
	
	
	
	
	
	
	
}
