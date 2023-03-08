package tema1.resueltos;

public class Ejercicio1_0_i_Objetos {
	//  Crea dos arrays, uno con los nombres de 4 o 5 usuarios de cualquier red social que uses,
	//	y otro con sus seguidores. Realiza un programa que muestre por consola esos usuarios 
	//  primero sin ordenar y luego ordenados por número de seguidores 
	//	(de mayor a menor).
	public static void main(String[] args) {
		/*String[] usuarios = { "@sama", "@JeffBezos", "@BillGates", "@elonmusk" };
			int[] seguidores = { 1300, 61000, 62000, 128900 };*/

		/* NULL POINTER EXCEPTION
			usuariosRS[0].nombre = "@sama";
			usuariosRS[0].seguidores = 1300;
			SIEMPRE HAY QUE CREARLOS!!!
		 Manera 1: crear arrayy luego meter datos
		UsuariosRedSocial[] usuariosRS = new UsuariosRedSocial[4];
		
		usuariosRS[0] = new UsuariosRedSocial();
		usuariosRS[0].nombre = "@sama";
		usuariosRS[0].seguidores = 1300;

		usuariosRS[1] = new UsuariosRedSocial();
		usuariosRS[1].nombre = "@sama";
		usuariosRS[1].seguidores = 1300;
		
		usuariosRS[2] = new UsuariosRedSocial();
		usuariosRS[2].nombre = "@sama";
		usuariosRS[2].seguidores = 1300;
		
		usuariosRS[3] = new UsuariosRedSocial();
		usuariosRS[3].nombre = "@sama";
		usuariosRS[3].seguidores = 1300;
		 */
		/* Manera 2: crear objetos y luego crear el array
		UsuariosRedSocial usuario1 = new UsuariosRedSocial("@sama", 1300);
		UsuariosRedSocial usuario2 = new UsuariosRedSocial("@JeffBezos", 61000);
		UsuariosRedSocial usuario3 = new UsuariosRedSocial("@BillGates", 62000);
		UsuariosRedSocial usuario4 = new UsuariosRedSocial("@elonmusk", 128900);
		UsuariosRedSocial[] usuariosRS = {usuario1, usuario2, usuario3, usuario4};
		 */
		/* Manera3: crear el array creando los objetos al vuelo
		 * */
		UsuariosRedSocial[] usuariosRS = new UsuariosRedSocial[] {
			new UsuariosRedSocial("@sama", 1300),
			new UsuariosRedSocial("@JeffBezos", 61000),
			new UsuariosRedSocial("@BillGates", 62000),
			new UsuariosRedSocial("@elonmusk", 128900),		
		};
		
		ordenaUsuariosPorSeguidores( usuariosRS );
		visualizarUsuariosYSeguidores( usuariosRS );
		
		pruebasChorras();
	}

	private static void pruebasChorras() {
		UsuariosRedSocial u = new UsuariosRedSocial();
		u.setMilesSeguidores(-5000);
		u.sacarAConsola();
	}
	
	// Visualiza línea a línea usuario tabulador nº seguidores
	private static void visualizarUsuariosYSeguidores(UsuariosRedSocial[] usuariosRS) {
		for (int i=0; i<usuariosRS.length; i++) {
			// System.out.println( usuariosRS[i].convertirAString() );
			usuariosRS[i].sacarAConsola();
		}
	}

	private static void ordenaUsuariosPorSeguidores(UsuariosRedSocial[] usuariosRS) {
		for (int pasada=0; pasada<usuariosRS.length-1; pasada++) {
			for (int comp=0; comp<usuariosRS.length-1; comp++) {  // TODO mejorar que solo se hagan las comparaciones necesarias
				boolean hayQueIntercambiar = usuariosRS[comp].getMilesSeguidores() < usuariosRS[comp+1].getMilesSeguidores();
				if (hayQueIntercambiar) {
					UsuariosRedSocial aux = usuariosRS[comp];
					usuariosRS[comp] = usuariosRS[comp+1];
					usuariosRS[comp+1] = aux;
				}
			}
		}
	}
}