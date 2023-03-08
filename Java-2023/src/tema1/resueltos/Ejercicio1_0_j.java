package tema1.resueltos;

public class Ejercicio1_0_j {
	/*
	Crea un array de 100 bytes y calcula en él los primeros 100 números de fibonacci
	(la serie de fibonacci es 1, 1, 2, 3, 5… donde cada número se calcula sumando los dos anteriores).
	Visualízalo en consola y observa los problemas. Haz lo mismo con arrays de short, int, long, float y double.
	(¿Hasta dónde habría que llegar para tener problemas en float o double?)
	 */
	public static void main(String[] args) {
		byte[] fibonacci = new byte[100];
		fibonacci[0]=0;
		fibonacci[1]=1;
		crearSerieFibonacci(fibonacci);
		printearIndividual(fibonacci);
	}
	
	private static void crearSerieFibonacci(byte[] fibonacci) {
		for(int i=2;i<100;i++) {
			byte sumado1=fibonacci[i-2];
			byte sumado2=fibonacci[i-1];
			int resultado = sumado1 + sumado2;
			byte resultadob = (byte)resultado;
			fibonacci[i] = resultadob;
		}
	}
	private static void printearIndividual(byte[] fibonacci) {
		for (int i : fibonacci) {
			System.out.println(i);
		}
	}

}
