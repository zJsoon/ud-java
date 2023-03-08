package Clase_03.figuras;

public class Cuadrado extends Figura{

	public Cuadrado() {
		super();
	}

	public Cuadrado(float base) {
		super(base);
	}

	@Override
	public String toString() {
		return "Cuadrado [base=" + getBase() + "]";
	}
	
	@Override // Sobreescribir en el metodo area en cuadrado
	public float calcularArea() {
		return base*base;
	}
}
