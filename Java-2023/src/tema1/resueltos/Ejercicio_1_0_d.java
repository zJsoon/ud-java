package tema1.resueltos;

public class Ejercicio_1_0_d {
	public static void main(String[] args) {
		System.out.println("Numeros primos del 1-100:");
		for(int cont=0;cont<100;cont++) {
			if(primos(cont)) {
				System.out.println("PRIMO: " + cont);
			}
			if(!primos(cont)) {
				System.out.println("NO PRIMO: " + cont);
			}
		}
	}
	private static boolean primos(int num) {
		boolean esPrimo = true;
		for(int divisor=2;divisor<num;divisor++) {
			if(num%divisor == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
