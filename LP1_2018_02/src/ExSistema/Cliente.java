package ExSistema;

public class Cliente extends Pessoa {
	public String login;

	public Cliente(String nome, String CPF, String nacionalidade, int idade, double altura, double peso, String login) {
		super(nome, CPF, nacionalidade, idade, altura, peso);
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Cliente [login=" + login + "]";
	}
	
	

}
