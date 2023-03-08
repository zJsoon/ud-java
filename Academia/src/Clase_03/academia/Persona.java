package Clase_03.academia;

public class Persona {
	private String dni;
	private String nom;
	private int edad;
	private String email;
	
	public Persona() {
		super();
	}
	
	public Persona(String dni, String nom, int edad, String email) {
		super();
		this.dni = dni;
		this.nom = nom;
		this.edad = edad;
		this.email = email;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nom + ", edad=" + edad + ", email=" + email + "]";
	}
	
}
