package tema1.ejercicio13;

import java.awt.Point;
import utils.ventanas.ventanaBitmap.VentanaGrafica;

public class Clicker {
	private static VentanaGrafica vent;
	public static void main(String[] args) {
		crearVentana();
		juego();
	}
	private static void crearVentana() {
		vent = new VentanaGrafica(800, 600, "zJson Game");
	}
	private static void juego() {
		while(!vent.estaCerrada()) {
			Circulo circulo = nuevoCirculo();
			vent.borra();
			circulo.dibuja(vent);
			clickCirculo(circulo);
		}
	}
	private static Circulo nuevoCirculo() {
		Circulo cir = new Circulo();
		return cir;
	}
	private static void clickCirculo(Circulo circulo) {
		while(!vent.estaCerrada()) {
			Point punto = vent.getRatonClicado();
			if(punto!=null) {
				if(circulo.tienePunto(punto)) {
					return;
				}
			}
		}
	}
}
