package tema1.ejercicio13;

import java.awt.Point;
import java.util.ArrayList;

import utils.ventanas.ventanaBitmap.VentanaGrafica;

public class GrupoCirculos {
	private ArrayList<Circulo> listaCirculos;
	
	public GrupoCirculos() {
		listaCirculos = new ArrayList<Circulo>();
	}
	public void add(Circulo circulo) {
		listaCirculos.add(circulo);
	}
	public int size() {
		return listaCirculos.size();
	}
	
	public void remove(Circulo circulo) {
		listaCirculos.remove(circulo);
	}
	public void dibujar( VentanaGrafica v) {
		for (Circulo circulo : listaCirculos) {
			circulo.dibuja( v );
		}
	}
	public Circulo cuentaCirculoEnPunto( Point punto) {
		Circulo hayCirculoClicado = null;
		for (Circulo circulo : listaCirculos) {
			if (circulo.tienePunto( punto )) {
				hayCirculoClicado = circulo;
				break;
			}
		}
		return hayCirculoClicado;
	}
}
