package tema1.ejercicio13;

import java.awt.Point;
import utils.ventanas.ventanaBitmap.VentanaGrafica;

public class ClickerPrincipal {
	public static void main(String[] args) {
		//		Circulo c = new Circulo(15, 100, 200, Color.CYAN, Color.blue);
		//		System.out.println(c.toString());
		//		Point punto = new Point(200, 150);
		//		Circulo c2 = new Circulo(15, punto, Color.WHITE, Color.BLUE);
		//		System.out.println(c2);
		//		Circulo c3 = new Circulo(15, 200, 150);
		//		System.out.println(c3 + ": Color Borde -> " + c3.getColorBorde() + ", Color Relleno -> " + c3.getColorRelleno());
		Circulo circulo = new Circulo();
		System.out.println(circulo + ": Color Borde -> " + circulo.getColorBorde() + ", Color Relleno -> " + circulo.getColorRelleno());
		crearVentana(circulo);

	}

	private static void crearVentana(Circulo circulo){
		// Pruebas de ventana gráfica
		VentanaGrafica vent = new VentanaGrafica( 800, 600, "Mi ventanita" );
		vent.dibujaCirculo(circulo.getxCentro(), circulo.getyCentro(), circulo.getRadioEnPixels(), 1, circulo.getColorBorde(), circulo.getColorRelleno());
		Point punto = vent.getRatonClicado();
		punto = vent.esperaAClick();
		System.out.println( punto );

	}
}
