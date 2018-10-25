package Conteudo2;

public class Cilindro extends FiguraGeo {
	public double raio;

	public Cilindro(double altura, double raio) {
		super(altura);
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return (2 * Math.PI * this.raio) 
				* super.altura;
	}
}
