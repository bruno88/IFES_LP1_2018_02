package CorrecaoProva.Prova2;

public abstract class Funcionario implements IRegistravel {
	private String nome, Projeto;
	private int idade, horaEntrada, horaSaida;
	private static final int jornada = 8;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProjeto() {
		return Projeto;
	}

	public void setProjeto(String projeto) {
		Projeto = projeto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	@Override
	public void baterPontoEntrada(int horaEntrada) {
		this.setHoraEntrada(horaEntrada);

	}

	@Override
	public void baterPontoSaida(int horaSaida) {
		this.setHoraSaida(horaSaida);
	}

	@Override
	public boolean isJornadaDiariaCompleta() {
		int horasTrabalhadas = Math.abs(this.getHoraSaida() - 
				this.getHoraEntrada());

		if (horasTrabalhadas >= jornada) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int getHoraExtra() {
		int horasTrabalhadas = Math.abs(this.getHoraSaida() - this.getHoraEntrada());

		if (horasTrabalhadas <= jornada) {
			return 0;
		} else {
			return horasTrabalhadas - jornada;
		}
	}

	@Override
	public void limpaPonto() {
		this.setHoraEntrada(0);
		this.setHoraSaida(0);

	}

}
