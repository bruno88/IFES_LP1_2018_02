package CorrecaoProva.Prova2;

public class Principal {
	public static void main(String[] args) {
		IRegistravel f1 = new Analista();
		// Registra ponto
		registraHoraEntrada(f1, 7);
		registraHoraSaida(f1, 10);
		
		// Verificar jornada
		if (isJornadaDiariaCompleta(f1)) {
			System.out.println("Jornada completa");
		} else {
			System.out.println("Jornada incompleta");
		}
		registraHoraSaida(f1, 15);
		
		// 
		if (isJornadaDiariaCompleta(f1)) {
			System.out.println("Jornada completa");
		} else {
			System.out.println("Jornada incompleta");
		}
		
		// Verificar horas extras trabalhadas
		int horaExtra = getHoraExtra(f1);
		System.out.println("Horas extras: " + horaExtra);
		
		// Aumenta o horário de saída
		registraHoraSaida(f1, 18);
		
		// Verificar horas extras trabalhadas
		horaExtra = getHoraExtra(f1);
		System.out.println("Horas extras: " + horaExtra);
	}

	public static void registraHoraEntrada(
			IRegistravel IReg,
			int hora) {
		IReg.baterPontoEntrada(hora);
	}

	public static void registraHoraSaida(
			IRegistravel IReg,
			int hora) {
		IReg.baterPontoSaida(hora);
	}

	public static boolean isJornadaDiariaCompleta(
			IRegistravel IReg) {
		return IReg.isJornadaDiariaCompleta();
	}

	public static int getHoraExtra(IRegistravel IReg) {
		return IReg.getHoraExtra();
	}

}
