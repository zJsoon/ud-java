package ejercicios.ej2;

import java.awt.Color;
import java.awt.Point;

/** Clase básica para crear y utilizar vectores 2D
 */
public class Vector2D {
	private double xOrigen;
	private double yOrigen;
	private double x;
	private double y;
	private Color color;

	// Constructores
	
	/** Construye un nuevo vector de color azul
	 * @param xOrigen	Coordenada x de origen de vector
	 * @param yOrigen	Coordenada y de origen de vector
	 * @param xFinal	Coordenada x de final de vector
	 * @param yFinal	Coordenada y de final de vector
	 */
	public Vector2D( double xOrigen, double yOrigen, double xFinal, double yFinal ) {
		this( xOrigen, yOrigen, xFinal, yFinal, Color.BLUE );
	}
	
	/** Construye un nuevo vector
	 * @param xOrigen	Coordenada x de origen de vector
	 * @param yOrigen	Coordenada y de origen de vector
	 * @param xFinal	Coordenada x de final de vector
	 * @param yFinal	Coordenada y de final de vector
	 * @param color
	 */
	public Vector2D( double xOrigen, double yOrigen, double xFinal, double yFinal, Color color ) {
		this.xOrigen = xOrigen;
		this.yOrigen = yOrigen;
		this.x = xFinal;
		this.y = yFinal;
		this.color = color;
	}
	
	// Métodos get y set

	/** Devuelve la coordenada x
	 * @return	Coordenada x
	 */
	public double getX() {
		return this.x;
	}
	
	/** Cambia la coordenada x
	 * @param x	Nuevo valor de coordenada x
	 */
	public void setX( double x ) {
		this.x = x;
	}
	
	/** Devuelve la coordenada y
	 * @return	Coordenada y
	 */
	public double getY() {
		return y;
	}

	/** Cambia la coordenada y
	 * @param x	Nuevo valor de coordenada y
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/** Cambia las coordenadas x, y
	 * @param puntoXY	Nuevo valor de coordenadas x,y
	 */
	public void setXY( Point puntoXY ) {
		setX( puntoXY.getX() );
		setY( puntoXY.getY() );
	}

	/** Devuelve la coordenada de origen del vector
	 * @return	Coordenada x de origen
	 */
	public double getxOrigen() {
		return xOrigen;
	}

	/** Modifica la coordenada de origen del vector
	 * @param xOrigen	Nueva coordenada x
	 */
	public void setxOrigen(double xOrigen) {
		this.xOrigen = xOrigen;
	}

	/** Devuelve la coordenada de origen del vector
	 * @return	Coordenada y de origen
	 */
	public double getyOrigen() {
		return yOrigen;
	}

	/** Modifica la coordenada de origen del vector
	 * @param yOrigen	Nueva coordenada y
	 */
	public void setyOrigen(double yOrigen) {
		this.yOrigen = yOrigen;
	}
	
	/** Devuelve el último color en el que se ha dibujado
	 * @return	color del último dibujado, null si nunca se ha dibujado
	 */
	public Color getColor() {
		return color;
	}

	/** Modifica el color de dibujado
	 * @param color	nuevo color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	// Métodos de funcionalidad
	
	/** Dibuja un vector en una ventana gráfica, como una flecha
	 * @param vent	Ventana en la que dibujar el vector
	 * @param grosor	Ancho de la línea que se dibuja
	 */
	public void dibujar( VentanaGrafica vent, float grosor ) {
		vent.dibujaFlecha( xOrigen, yOrigen, x, y, grosor, color, 12 );
	}

	/** Calcula la distancia de un punto al gráfico. Es 0 si toca exactamente el gráfico y puede ser negativa si es interior
	 * @param punto	Punto
	 * @return	Distancia menor entre el punto y el gráfico
	 */
	public double distancia( Point punto ) {
		java.awt.geom.Line2D.Double segmento = new java.awt.geom.Line2D.Double( new java.awt.geom.Point2D.Double( xOrigen, yOrigen ), new java.awt.geom.Point2D.Double( x, y ) );
		double dist = segmento.ptSegDist( punto );
		return dist;
	}

	/** Comprueba si un punto del plano toca con el gráfico
	 * @param punto	Punto a comprobar
	 * @param margen	Margen de distancia con el que se entiende que hay contacto (por ejemplo 2.0 - 2 o menos píxels de distancia)
	 * @return	true si el punto toca con el gráfico dentro del margen indicado, false en caso contrario
	 */
	public boolean toca( Point punto, double margen ) {
		return distancia( punto ) <= margen;
	}
	
	/** Calcula y devuelve el módulo del vector (longitud)
	 * @return	Devuelve el módulo del vector calculado por pitágoras
	 */
	public double getModulo() {
		return Math.sqrt( (x-xOrigen)*(x-xOrigen) + (y-yOrigen)*(y-yOrigen) );
	}
	
	/** Calcula y devuelve el argumento del vector (ángulo sobre el OX positivo hacia el OY positivo)
	 * @return	Ángulo de argumento del vector en radianes
	 */
	public double getArgumento() {
		return Math.atan2(y-yOrigen, x-xOrigen);
	}
	
	/** Escala un vector
	 * @param escala	Escala a aplicar, siendo 1.0 el 100%, menores que 1 más pequeños (0.5 la mitad), mayores que 1 más grandes (2.0 el doble)
	 */
	public void escala(double escala) {
		x = xOrigen + (x-xOrigen)*escala;
		y = yOrigen + (y-yOrigen)*escala;
	}
	
	@Override
	public String toString() {
		return "(" + xOrigen + "," + yOrigen + ") -> (" + x + "," + y + ")";
	}
	
	// Constructor indirecto estático - NO SE HEREDA luego hay que hacer uno completamente nuevo

	/** Construye un vector en coords polares
	 * @param xOrigen	Coordenada x de origen de vector
	 * @param yOrigen	Coordenada y de origen de vector
	 * @param modulo	Longitud del vector
	 * @param argumento	Ángulo del vector con respecto al eje OX positivo
	 * @return	Devuelve el vector creado
	 */
	public static Vector2D crearVectorPolar( double xOrigen, double yOrigen, double modulo, double argumento ) {
		Vector2D ret = new Vector2D( xOrigen, yOrigen, 
			xOrigen + modulo * Math.cos(argumento), yOrigen + modulo * Math.sin(argumento) );
		return ret;
	}
	
	
}
