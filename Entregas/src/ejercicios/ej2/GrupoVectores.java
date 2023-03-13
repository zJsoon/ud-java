package ejercicios.ej2;

/** Grupo secuencial indexado de vectores (implementado con un arraylist)
 * (Implementación alternativa a GrupoVectoresArray)
 */
public class GrupoVectores {
	// TODO Definir atributos

	/** Crea un grupo de vectores
	 */
	public GrupoVectores() {
		// TODO codificar este método
	}
	
	/** Devuelve el número de vectores guardados en este grupo
	 * @return	Número actual de vectores
	 */
	public int size() {
		// TODO codificar este método
		return 0;
	}
	
	/** Devuelve el vector situado en una posición dada
	 * @param indice	Su posición
	 * @return	El vector situado en esa posición
	 * @throws IndexOutOfBoundsException	Error generado si la posición no existe
	 */
	public Vector2D get( int indice ) throws IndexOutOfBoundsException {
		// TODO codificar este método
		return null;
	}
	
	/** Añade un nuevo vector al final del grupo
	 * @param vec	Vector nuevo
	 */
	public void anyadir( Vector2D vec ) {
		// TODO codificar este método
	}
	
	/** Inserta un vector en el grupo (moviendo el resto de vectores de acuerdo al nuevo).
	 * Esta operación es errónea si el vector es nulo o si el índice está fuera de rango (menor que 0 o mayor que el size())
	 * @param indice	Posición en la que se va a insertar
	 * @param vec	Vector nuevo
	 * @return	true si la inserción ha sido correcta, false si no se ha podido hacer
	 */
	public boolean insertar( int indice, Vector2D vec ) {
		// TODO codificar este método
		return false;
	}
	
	/** Borra un vector del grupo
	 * @param indice	Posición del elemento que queremos borrar
	 */
	public void borrar( int indice ) {
		// TODO codificar este método
	}
	
	@Override
	public String toString() {
		// TODO codificar este método
		return "";
	}
	
}
