package tema1.resueltos;

public class UsuariosRedSocial {
	public static int numUsuarios = 0;

	/** Crea un usuario nuevo con nombre vacio (" ") y 0 seguidores
	 * 
	 */
	public UsuariosRedSocial() {
		nombre = "";
		UsuariosRedSocial.numUsuarios++;
	}

	private String nombre; // COMPOSICIÓN
	private int milesSeguidores;
	private long fechaAlta;
	
	/** Crea un usuario nuevo con seguidores
	 * @param nombre	Nombre del usuario
	 * @param seguidores	Número de seguidores
	 */
	public UsuariosRedSocial(String nombre, int seguidores) {
		// Constructores los unicos metodo que no tienen una unica palabra de devolución
		this.nombre = nombre;
		this.milesSeguidores = seguidores;
	}
	
	
	/** Crea un usuario con 0 seguidores
	 * @param nombre	Nombre de este usuario
	 */
	public UsuariosRedSocial(String nombre) {
		this.nombre = nombre;
		this.milesSeguidores = 0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	/* Esto es para que el nombre no sea mutable y no se pueda cambiar.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	*/
	public long getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(long fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public void setMilesSeguidores(int seguidores) {
		if(seguidores < 0) {
			System.err.println( "Error: Los seguidores no pueden ser negativos." );
		}else {			
			this.milesSeguidores = seguidores;
		}
	}

	public int getMilesSeguidores() {
		return this.milesSeguidores;
	}
	
	public String convertirAString() {
		return nombre + "\t" + milesSeguidores;
	}
	public void sacarAConsola() {
		System.out.println(convertirAString());
	}
}
