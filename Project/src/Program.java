import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int op = options(args);
		if (op == 9) {
			System.out.print("Ya hemos terminado, que tengas un buen dia!");
		}
		else if(op == 1){
			operarMenuSeries(args);
		}
		else if(op == 2) {
			System.out.println("operarMenuPeliculas");
		}
		else {
			System.out.println("INTRODUCE UNA OPCION VALIDA");
			System.out.println(" ");
		}
	}
	/* OPCIONES */
	private static int options(String[] args) {
		int op;
		
		mostrarMenu();
		System.out.print("Elige una opcion del menu: ");
		try (Scanner option = new Scanner (System.in)) {
			op = option.nextInt();
		}
		return op;
	}
	/* MARCA DE AGUA */
	private static String marcaAgua() {
		String marca = "====================AGC====================";
		return marca;
	}
	/* OPCIONES DB MENU */
	private static void mostrarMenu(){
		System.out.println(marcaAgua());
		System.out.println("    1 - Series");
		System.out.println("    2 - Peliculas");
		System.out.println("    9 - Exit");
		System.out.println(marcaAgua());
	}
	/* OPCIONES SERIES MENU */
	private static void mostrarMenuSeries() {
		System.out.println(marcaAgua());
		System.out.println("        1 - Ver listado de series");
		System.out.println("        2 - Add una serie nueva");
		System.out.println("        3 - Modificar una serie");
		System.out.println("        4 - Eliminar una serie");
		System.out.println("        5 - Ver detalles de una serie");
		System.out.println("        6 - Listar series por generos");
		System.out.println("        9 - Exit");
		System.out.println(marcaAgua());
	}
	/* OPERAR MENU SERIES */
	private static void operarMenuSeries(String[] args) {
		boolean continuarMenu = true;
		while( continuarMenu == true) {
			mostrarMenuSeries();
			int op = options(args);
			marcaAgua();
			if (op == 9) {
				continuarMenu = false;
			}
			else if (op == 1) {
				System.out.println("1 - Ver listado de series");
			}
			else if (op == 2) {
				System.out.println("2 - Add una serie nueva");
			}
			else if (op == 3) {
				System.out.println("3 - Modificar una serie");
			}
			else if (op == 4) {
				System.out.println("4 - Eliminar una serie");
			}
			else if (op == 5) {
				System.out.println("5 - Ver detalles de una serie");
			}
			else if (op == 6) {
				System.out.println("6 - Listar series por generos");
			}
			else {
				System.out.println("INTRODUCE UNA OPCION VALIDA");
				System.out.println(" ");
			}
		}
	}
}
