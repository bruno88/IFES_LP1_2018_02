package Conteudo2;

public class Principal {
	public static void main(String[] args) {
		FiguraGeo fig1 = new Triangulo(10,3);
		System.out.println(fig1.getArea());
		FiguraGeo fig2 = new Cilindro(20, 4);
		System.out.println(fig2.getArea());
	}
}
