package Clase_04;

public class Cliente {
	private String nombre;
	private String dni;
	private String pass;
	public Cliente() {
		super();
		// TODO 
	}
	
	public Cliente(String dni, String nombre, String pass) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.pass = pass;
	}
	
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Cliente: dni=" + dni + ", nombre=" + nombre + ", pass=" + pass;
	}
}