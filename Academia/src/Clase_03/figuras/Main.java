package Clase_03.figuras;

public class Main {
	public static void main(String[] args) {
		Triangulo t = new Triangulo(2, 3);
		System.out.println("La base del triangulo es: " + t.getBase());
		System.out.println("El area del triangulo es: " + t.calcularArea());
		Cuadrado c = new Cuadrado(10);
		System.out.println("La base del cuadrado es: " + c.getBase());
		System.out.println("La area del cuadrado es: " + c.calcularArea());
	}
}
