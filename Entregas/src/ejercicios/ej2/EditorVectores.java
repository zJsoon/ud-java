package ejercicios.ej2;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

/** Sistema de edición sencilla de vectores bidimensionales
 */
public class EditorVectores {

	private static final int ANCHO_VENTANA = 600;
	private static final int ALTO_VENTANA = 400;

	private static GrupoVectores grupo;  // Grupo de vectores de edición
	
	/** Método principal de prueba de la clase
	 * @param args	No utilizado
	 */
	public static void main(String[] args) {
		edicionDeGraficos();
	}
	
	// Bucle principal de sistema de edición de gráficos
	private static void edicionDeGraficos() {
		VentanaGrafica vent = new VentanaGrafica( ANCHO_VENTANA, ALTO_VENTANA, "Dibujo de gráficos");
		// vent.getJFrame().setLocation( 2000, 0 );  // Poner esto si se quiere cambiar la posición inicial de la ventana a otras coordenadas
		grupo = new GrupoVectores();
		Point pulsacionInicial = null;
		vent.setMensaje( "Drag crea vector, Alt-click borra, Click selecciona, otro click mueve" );
		vent.setDibujadoInmediato( false ); // Preparación de doble buffer
		Vector2D vectorSeleccionado = null;
		while (!vent.estaCerrada()) {
			boolean esClick = true;
			pulsacionInicial = vent.getRatonPulsado();
			Point pulsacionProgresiva = pulsacionInicial;
			Point pulsacionFinal = pulsacionInicial;
			while (pulsacionFinal!=null) {
				if (!pulsacionInicial.equals(pulsacionFinal)) {
					esClick = false;
				}
				pulsacionProgresiva = pulsacionFinal;
				pulsacionFinal = vent.getRatonPulsado();
			}
			if (esClick && pulsacionInicial!=null) {  // Hay un click (pulsación no cambia de coordenada)
				// Click - distinto con o sin Alt
				if (vent.isTeclaPulsada(KeyEvent.VK_ALT)) {  // Alt = borrar
					// Comprobar si hay un gráfico en ese punto
					int indiceVectorABorrar = comprobarGraficoEnClick( grupo, pulsacionInicial );
					if (indiceVectorABorrar!=-1) {
						System.out.println( "Borrado el gráfico " + indiceVectorABorrar );
						grupo.borrar( indiceVectorABorrar );
						vectorSeleccionado = null;
					}
				} else {  // Click sin alt
					int gASeleccionar = comprobarGraficoEnClick( grupo, pulsacionInicial );
					if (gASeleccionar!=-1) { // Cuando se hace sobre un gráfico - se selecciona
						vectorSeleccionado = grupo.get(gASeleccionar);
					} else {  // Click en el fondo (sobre ningún gráfico)
						if (vectorSeleccionado!=null) {  // Mover el gráfico ya seleccionado
							vectorSeleccionado.setXY( pulsacionInicial );
						}
					}
				}
			} else if (!esClick) { // Drag de ratón (pulsación de suelta diferente a la de inicio)
				// System.out.println( "Drag de " + clickInicial + " a " + clickIntermedio );
				// Crear vector nuevo entre las dos coordenadas
				Vector2D vec = new Vector2D( pulsacionInicial.getX(), pulsacionInicial.getY(), pulsacionProgresiva.getX(), pulsacionProgresiva.getY() );
				grupo.anyadir( vec );
				if (vec.getModulo()<100) {  // Selección de color en función de la longitud del vector
					vec.setColor( Color.RED );
					vec.dibujar( vent, 2.0f );
				} else if (vec.getModulo()<250) {
					vec.setColor( Color.ORANGE );
					vec.dibujar( vent, 2.0f );
				} else {
					vec.setColor( Color.GREEN );
					vec.dibujar( vent, 2.0f );
				}
				vectorSeleccionado = null;
				System.out.println( "Hay guardados " + grupo.size() + " gráficos" );
			}
			// Repintar la ventana en cada frame:
			vent.borra();
			for (int i=0; i<grupo.size(); i++) {
				grupo.get(i).dibujar( vent, 2.0f );
			}
			if (vectorSeleccionado!=null) {
				vectorSeleccionado.dibujar( vent, 3.0f );
			}
			vent.repaint();  // Volcado de doble buffer (para pintar sin flickering -el cambio de pantalla es suave entre fotogramas-)
			vent.espera(20);  // Espera hasta el siguiente frame (20 msgs = 50 frames por segundo aprox.)  (1000/20 = 50)
		}
		System.out.println( "Fin!" );
		vent.acaba();
	}
	
	private static int comprobarGraficoEnClick( GrupoVectores grupo, Point clickInicial ) {
		int vEnClick = -1;
		Point temp = new Point();
		temp.setLocation( clickInicial.getX(), clickInicial.getY() );
		for (int i=0; i<grupo.size(); i++) {
			if (grupo.get(i).toca( temp, 5.0 )) {
				vEnClick = i;
			}
		}
		return vEnClick;
	}
	
}
