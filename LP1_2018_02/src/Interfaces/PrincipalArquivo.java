package Interfaces;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class PrincipalArquivo {
	public static void main(String[] args) {
		ArrayList<IWritable> lista = new ArrayList<>();
		Animal animal1 = new Animal ("Totó", 2);
		lista.add(animal1);
		Animal animal2 = new Animal ("Bichano", 2);
		lista.add(animal2);
		Animal animal3 = new Animal ("Miau", 2);
		lista.add(animal3);
		
		Pessoa pessoa1 = new Pessoa ("Ana", "123", "1111","a@b.c" , 20);
		lista.add(pessoa1);
		Pessoa pessoa2 = new Pessoa ("Bruno", "123", "1111","a@b.c" , 20);
		lista.add(pessoa2);
		
		Ingrediente ingr1 = new Ingrediente("Canela", "doce");
		lista.add(ingr1);
		Ingrediente ingr2 = new Ingrediente("Sal", "salgado");
		lista.add(ingr2);
		Ingrediente ingr3 = new Ingrediente("Limão", "azedo");
		lista.add(ingr3);
		Ingrediente ingr4 = new Ingrediente("Pimenta", "apimentado");
		lista.add(ingr4);
		
		try {
			Iterator<IWritable> it = lista.iterator();
			while (it.hasNext()) {
				testaSalva(it.next());
				System.out.println("Salvo com sucesso");
			}
			
			/*for (IWritable iWritable : lista) {
				testaSalva(iWritable);
				System.out.println("Salvo com sucesso");
			}*/
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void testaSalva(IWritable obj) 
			throws IOException {
		obj.salvaTxt();
	}
}
