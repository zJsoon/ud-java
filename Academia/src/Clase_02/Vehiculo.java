package Clase_02;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String color;
	
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehiculo(String matricula, String marca, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}
	public Vehiculo(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]";
	}
	
}
