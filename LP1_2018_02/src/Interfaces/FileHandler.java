package Interfaces;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {	
	final static String path = "src/Interfaces/Saidas/";
	// Concatena String ao final do texto
	public static void salvarComAppend(String nomeArquivo, 
			String texto) throws IOException {
		FileWriter arquivo = new FileWriter(path+nomeArquivo, true);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.append(texto);
		gravador.newLine();
		gravador.close();
		arquivo.close();

	}
}
