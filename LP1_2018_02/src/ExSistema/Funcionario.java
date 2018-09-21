package ExSistema;

public class Funcionario extends Pessoa {
	private String SIAPE, cargo;
	private double salario;

	public Funcionario(String nome, String CPF, String nacionalidade, 
			int idade, double altura, double peso, String sIAPE) {
		super(nome, CPF, nacionalidade, idade, altura, peso);
		this.SIAPE = sIAPE;
	}
			
	public Funcionario(String nome, String CPF, String nacionalidade, 
			int idade, double altura, double peso,
			String sIAPE, String cargo, double salario) {
		super(nome, CPF, nacionalidade, idade, altura, peso);
		SIAPE = sIAPE;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	

	public String getSIAPE() {
		return SIAPE;
	}

	public void setSIAPE(String sIAPE) {
		SIAPE = sIAPE;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [SIAPE=" + SIAPE + ", cargo=" + cargo + ", salario=" + salario + "]";
	}

}
