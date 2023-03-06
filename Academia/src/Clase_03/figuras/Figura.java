package Clase_03.figuras;
/*
 * CUANDO UNA CLASE ES ABSTRACTA NO SE PUEDE INSTANCIAR(no se pueden crear objetos de esa clase)
 * 
 * protected: Se puede acceder al atributo desde la clase en la que está declarado, desde las clases que heredan de ella y desde las que estén en el mismo paquete.
 */
public abstract class Figura {
	protected float base;

	public Figura() {
		super();
	}

	public Figura(float base) {
		super();
		this.base = base;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public abstract float calcularArea(); // Metodo abstracto cuando es un metodo sin código
	
	@Override
	public String toString() {
		return "Figura [base=" + base + "]";
	}
	
}
