package tema1.ejercicio13;

import java.awt.Color;
import java.util.Date;
import java.awt.Point;
import java.util.Random;

/**
 * @author zJson
 */
public class Circulo {

	// STATIC
	private static float grosor = 1.0f; // Grosor del círculo, en píxeles.
	private static final int RADIO_MINIMO = 10; // Radio mínimo de circulo aleatorio
	private static final int RADIO_MAXIMO = 20; // Radio máximo de circulo aleatorio
	private static final int X_MAXIMA = 500;
	private static final int Y_MAXIMA = 300;
	private static Random random = new Random(); // Es static porque necesitas solo un generador para los números aleatorios. 
	
	public static float getGrosor() {
		return grosor;
	}

	public static void setGrosor(float grosor) {
		Circulo.grosor = grosor;
	}
	
	// NO STATIC
	private int radioEnPixels; // Radio del circulo en píxeles.
	private int xCentro; // Coordenadas X del circulo.
	private int yCentro; // Coordenadas Y del circulo.
	private Color colorBorde;
	private Color colorRelleno;
	private long momentoCreacionMS;


	/** Crea un círculo nuevo
	 * @param radioEnPixels	Radio del círculo en píxeles. Debe ser positivo
	 * @param xCentro	Coordenadas x del centro del círculo, en píxeles (de izquierda a derecha)
	 * @param yCentro	Coordenada y del centro del círculo, en píxeles (de arriba a abajo)
	 * @param colorBorde	Color del borde
	 * @param colorRelleno	Color del relleno
	 */

	public Circulo(int radioEnPixels, int xCentro, int yCentro, Color colorBorde, Color colorRelleno) {
		super();
		this.radioEnPixels = radioEnPixels;
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.colorBorde = colorBorde;
		this.colorRelleno = colorRelleno;
		momentoCreacionMS = System.currentTimeMillis(); // momentoCreacionMS = (new Date()).getTime();

	}
	
	
	/** Crea un círculo nuevo
	 * @param radioEnPixels	Radio del círculo en píxeles. Debe ser positivo
	 * @param centro	Coordenadas del centro del círculo, en píxeles
	 * @param colorBorde	Color del borde
	 * @param colorRelleno	Color del relleno
	 */
	public Circulo(int radioEnPixels, Point centro, Color colorBorde, Color colorRelleno) {
		this(radioEnPixels, centro.x, centro.y, colorBorde, colorRelleno);
//		this.radioEnPixels = radioEnPixels;
//		this.xCentro = centro.x;
//		this.yCentro = centro.y;
//		this.colorBorde = colorBorde;
//		this.colorRelleno = colorRelleno;
		momentoCreacionMS = System.currentTimeMillis();

	}
	
	/** Crea un círculo nuevo de color azul y relleno amarillo
	 * @param radioEnPixels	Radio del círculo en píxeles. Debe ser positivo
	 * @param xCentro	Coordenadas x del centro del círculo, en píxeles (de izquierda a derecha)
	 * @param yCentro	Coordenada y del centro del círculo, en píxeles (de arriba a abajo)
	 */
	public Circulo(int radioEnPixels, int xCentro, int yCentro) {
		super();
		this.radioEnPixels = radioEnPixels;
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		colorBorde = Color.BLUE;
		colorRelleno = Color.YELLOW;
		momentoCreacionMS = System.currentTimeMillis();
	}

	/** Constructor aleatorio:
	 */
	public Circulo() {
		radioEnPixels = RADIO_MINIMO + random.nextInt(RADIO_MAXIMO - RADIO_MINIMO + 1); // 0 -10
		xCentro = random.nextInt(X_MAXIMA);
		yCentro = random.nextInt(Y_MAXIMA);
		colorBorde = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
		Color[] colores = {Color.PINK, Color.BLUE, Color.CYAN, Color.GREEN};
		colorRelleno = colores[random.nextInt(colores.length)];
		momentoCreacionMS = System.currentTimeMillis();
	}
	
	public String toString() {
		return String.format("(%d,%d) - %d", xCentro, yCentro, radioEnPixels);
		// return "(" + xCentro + "," + yCentro + ")";
	}

	public int getxCentro() {
		return xCentro;
	}


	public void setxCentro(int xCentro) {
		this.xCentro = xCentro;
	}


	public int getyCentro() {
		return yCentro;
	}


	public void setyCentro(int yCentro) {
		this.yCentro = yCentro;
	}


	public Color getColorBorde() {
		return colorBorde;
	}


	public void setColorBorde(Color colorBorde) {
		this.colorBorde = colorBorde;
	}


	public Color getColorRelleno() {
		return colorRelleno;
	}


	public void setColorRelleno(Color colorRelleno) {
		this.colorRelleno = colorRelleno;
	}


	public int getRadioEnPixels() {
		return radioEnPixels;
	}


	public long getMomentoCreacionMS() {
		return momentoCreacionMS;
	}
	
}