package Conteudo2;

public abstract class FiguraGeo {
	public double altura;
	
	public FiguraGeo(double altura) {
		this.altura = altura;
	}

	public abstract double getArea();
}
