package Clase_03.academia;

public class Profesor extends Persona{
	private String asignatura;

	public Profesor() {
		super();
	}

	public Profesor(String dni, String nom, int edad, String email, String asignatura) {
		super(dni, nom, edad, email);
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", dni=" + getDni() + ", nom=" + getNom()
				+ ", edad()=" + getEdad() + ", email=" + getEmail() + "]";
	}
	
	
}
