package CorrecaoProva.Prova1;

public class Endereco {
	private String rua, logradouro, bairro, cidade, estado, CEP;

	public Endereco(String rua, String logradouro, String bairro, String cidade, String estado, String cEP) {
		this.rua = rua;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		CEP = cEP;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + ", CEP=" + CEP + "]";
	}

}
