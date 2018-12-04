package CorrecaoProva.Prova2;

public interface IRegistravel {
	
	void baterPontoEntrada(int horaEntrada);
	void baterPontoSaida(int horaEntrada);
	boolean isJornadaDiariaCompleta();
	int getHoraExtra();
	void limpaPonto();
}
