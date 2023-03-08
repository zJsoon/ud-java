package Clase_03.academia;

/*
 * Se hereda todo EXCEPTO los constructores.
 */
public class Alumno extends Persona{
	private String carrera;

	public Alumno() {
		super(); // Llama al constructor de la clase padre(Persona).
	}

	public Alumno(String dni, String nom, int edad, String email, String carrera) {
		super(dni, nom, edad, email);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [carrera=" + carrera + ", dni=" + getDni() + ", nom=" + getNom() + ", edad="
				+ getEdad() + ", email=" + getEmail() + "]";
	}
}