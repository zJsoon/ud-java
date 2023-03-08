package Clase_02;
/*
 * ÁMBITO
 * 
 * public: Se  puede acceder desde cualquier clase del proyecto
 * private: Sólo se puede acceder desde la clase en la que está declarado el atributo
 * 
 */
public class Persona {
	private String dni;
	private String nombre;
	private int edad;
	
	/* Metodo constructor por defecto
	 * Reservar memoria para los atributos definidos en la clase*/
	public Persona(){
		
	}
	
	/* Método constructor específico
	 * Reservar memoria e inicializar los atributos definidos en la clase
	 * con los valores recibidos por parámetro
	 */
	public Persona(String dni, String n, int e){
		this.dni = dni; // Si llamamos igual al parámetro y al atributo el atributo siempre tiene que tener "this." al principio.
		nombre = n;
		edad = e;
	}
	
	public Persona(String d, String n) {
		dni = d;
		nombre = n;
	}
	/*
	 * MÉTODOS GET(consultores) y SET(modificadores)
	 */

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}