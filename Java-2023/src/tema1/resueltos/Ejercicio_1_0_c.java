package tema1.resueltos;

public class Ejercicio_1_0_c {
	public static void main(String[] args) {
		cabecera();
		for (int j=0;j<10;j++) {
			System.out.print("Tabla de " + j);
			for(int i = 0;i<10;i++) {
				String espacios = " ";
				if(j*i<10) espacios = "  ";
				System.out.print(espacios + i*j);
			}
			System.out.println();
		}
	}
	private static void cabecera() {
		System.out.println("          ");
		for(int i = 0;i<10;i++) {
			System.out.print("  " + i);
		}
		System.out.println();
		System.out.println("           -----------------------------");
	}
}