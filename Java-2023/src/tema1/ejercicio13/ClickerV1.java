package tema1.ejercicio13;

import java.awt.Point;
import utils.ventanas.ventanaBitmap.VentanaGrafica;

public class ClickerV1 {
	public static void main(String[] args) {
//		Circulo c = new Circulo(15, 100, 200, Color.CYAN, Color.blue);
//		System.out.println(c.toString());
//		Point punto = new Point(200, 150);
//		Circulo c2 = new Circulo(15, punto, Color.WHITE, Color.BLUE);
//		System.out.println(c2);
//		Circulo c3 = new Circulo(15, 200, 150);
//		System.out.println(c3 + ": Color Borde -> " + c3.getColorBorde() + ", Color Relleno -> " + c3.getColorRelleno());
		Circulo c4 = new Circulo();
		System.out.println(c4 + ": Color Borde -> " + c4.getColorBorde() + ", Color Relleno -> " + c4.getColorRelleno());
		crearVentana(c4);
	
	}
	
	private static void crearVentana(Circulo c4){
		// Pruebas de ventana gráfica
		VentanaGrafica vent = new VentanaGrafica( 800, 600, "Mi ventanita" );
		vent.dibujaCirculo(c4.getxCentro(), c4.getyCentro(), c4.getRadioEnPixels(), 1, c4.getColorBorde(), c4.getColorRelleno());
		Point punto = vent.getRatonClicado();
		punto = vent.esperaAClick();
		System.out.println( punto );
		while(clickaDentroDelCirculo(punto, c4.getxCentro(), c4.getyCentro(), c4.getRadioEnPixels()) == true){
			vent.borra();
		}
		
		
	}
	private static boolean clickaDentroDelCirculo(Point punto, double xPuntoCentro, double yPuntoCentro, double radioCirculo) {
		double distanciaX = xPuntoCentro - punto.getX();
		double distanciaY = yPuntoCentro - punto.getY();
		
		if (Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2)) < radioCirculo) {
			return true;
			
		}else {
			return false;
		}
	}	
}
