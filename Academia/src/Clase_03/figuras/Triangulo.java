package Clase_03.figuras;

public class Triangulo extends Figura{
	private float altura;

	public Triangulo() {
		super();
	}

	public Triangulo(float base, float altura) {
		super(base);
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + getBase() + "]";
	}

	@Override // Sobreescribir en el metodo area en triángulo
	public float calcularArea() {
		return (base*altura)/2;
	}
	
}
