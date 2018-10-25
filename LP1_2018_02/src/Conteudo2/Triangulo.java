package Conteudo2;

public class Triangulo extends FigComBase {

	public Triangulo(double altura, double base) {
		super(altura, base);

	}

	@Override
	public double getArea() {
		return super.base * super.altura / 2;
	}

	
}
