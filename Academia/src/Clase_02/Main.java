package Clase_02;

public class Main {
	public static void main(String[] args) {
		Persona p1 = new Persona(); // Reserva memoria, para DNI, nombre y edad.
		Persona p2 = new Persona("1111A", "Asier", 19); // Reserva memoria, para DNI, nombre y edad. Pero además inicializa los atributos
		System.out.println(p1.getDni() + " " + p1.getNombre() + " " + p1.getEdad());
		System.out.println(p2.getDni() + " " + p2.getNombre() + " " + p2.getEdad());
		System.out.println(p2);
		// Para poder visualizar un objeto tiene que tener implementado su método toString()
		
		/*VENTANA*/
		Ventana v = new Ventana();
		
	}
}
