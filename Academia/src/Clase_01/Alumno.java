package Clase_01;

public class Alumno {
	/* ATRIBUTOS DE INSTANCIA */
	private String dni;
	String nom;
	int edad;
	
	//Devuelve el valor del atributo no público
	public String getDni() {
		return dni;
	}
	
	//Modifica el valor del atributo no público
	public void setDni(String dni) {
		this.dni = dni;
	}	
}

/*
 * Cuando el ámbito de un atributo es privado, sólo se puede acceder a él, desde la clase en la que está declarado.
 */
