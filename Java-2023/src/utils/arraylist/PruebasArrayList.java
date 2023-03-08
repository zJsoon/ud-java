package utils.arraylist;

import java.util.ArrayList;

public class PruebasArrayList {
	private static ArrayList<Integer> l; // Wrappers: int - Integer | double - Double | boolean - Boolean
	
	public static void main(String[] args) {
		/*
		 * Si no queremos definir 10 variables para el mismo uso podemos crear una lista:
		 */
		l = new ArrayList<Integer>();
		
		l.add( new Integer(7) );
		l.add( Integer.valueOf(1) );
		l.add( 0, 24 );
		
		//Eliminar un elemento de la lista, en la posicion que quieras. l.remove(1);
		System.out.println(l + " - tamaño " + l.size());
		l.clear(); // Borra elementos
		System.out.println(l);
		l = null; // borra la lista
		System.out.println(l);
	}
}
