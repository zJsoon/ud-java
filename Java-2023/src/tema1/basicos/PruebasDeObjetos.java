package tema1.basicos;

import java.awt.Point;

public class PruebasDeObjetos {
	public static void main(String[] args) {
		primitivos();
		objetos();
	}
	private static void primitivos() {
		int dato = 25; // Resultado de la expresion 25
		int dato2 = dato; // Resultado de la expresion 25
		int dato3 = 12*2+1; // Resultado de la expresion 25
		
		if(dato == dato2) {
			System.out.println("Dato y dato2 son iguales");
		}
		if(dato==dato3) {
			System.out.println("Dato y dato3 son iguales");
		}
		dato2 = 26;
		System.out.println("Dato = " + dato + " Dato2 = " + dato2);
		
		
		borra(dato3);
		System.out.println("Dato3 = " + dato3);
		
	}
	
	private static void borra(int valor){
		valor = 0;
	}
	
	private static void objetos(){
		String string1 = new String("hola javadictxs"); // String string1 = "hola javadictxs"; // INMUTABLE
		String string2 = string1;
		String string3 = new String("hola "); // String string3 = "hola ";
		string3 = new String(string3 + "javadictxs"); // string3 += "javadictxs";
		
		
		if(string1==string2) {
			System.out.println("St1 y St2 iguales");
		}
		System.out.println("St1 = " + string1 + " Str3 = " + string3);
		if(string1==string3) {
			System.out.println("St1 y St3 iguales");
		}
		/*
		 * NO SE PUEDEN COMPARAR STRING CON IF POR QUE NOS INDICA SI LOS OBJETOS SON LOS MISMO O NO NO COMPARA EL VALOR.
		 * DEBEREMOS DE HACERLO CON EL METODO .equals
		 */
		if(string1.equals(string3)) { // Permite comparar objetos con objetos
			System.out.println("St1 equals 3");
		}
		borra(string3);
		System.out.println("String 3 = " + string3);
		// Comparaciones de tipos diversos: NO
		String s4 = "25";
		int i4 = 25;
		// if(i4==s4){} no se puede
		if((""+i4).equals(s4)) {System.out.println("Son iguales");} //si se puede
		
		Point punto1 = new Point(2,3);
		Point punto2 = punto1;
		Point punto3 = new Point(punto1); //new Point(2,3);
		if(punto1==punto3) {
			System.out.println("pt1 == pt3");
		}
		if(punto1.equals(punto3)) {
			System.out.println("pt1 equals pt3");
		}
		borra(punto3);
		System.out.println("Punto 3 = " + punto3);
	}
	private static void borra(Point punto) {
		punto.x = 0;
		punto.y = 0;
		//punto.set...
	}
	
	private static void borra (String string) {
		string = ""; // NO cambia el objeto original
		string.replaceAll("a", "e");
	}
}