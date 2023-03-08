package Clase_01;

public class MainClasesYObjetos {

	public static void main(String[] args) {
		
		// Declarar la variable
		Alumno a1;
		// Reservar memoria para la variable: Instanciar la variable
		a1 = new Alumno(); // Llamar al metodo constructor por defecto
		// Asignar valores a los atributos de a1
		
		//a1.dni = "12345678H";
		a1.setDni("12345678H");
		a1.nom = "Asier";
		a1.edad = 19;
		// Visualizar los variables
		// \n Salto de línea
		// \t Espacio de un tabulador
		System.out.println("DNI: "+a1.getDni()+" NOMBRE: "+a1.nom+" EDAD: "+a1.edad);
	}
}
