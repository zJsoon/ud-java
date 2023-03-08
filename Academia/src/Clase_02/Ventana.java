package Clase_02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	/*
	 * Funcionalidad del pantallas
	 * getContentPane() acceder al panel ediatble
	 * Layout --> BorderLayout
	 * North = Arriba
	 * East = Derecha
	 * South = Abajo
	 * West = Izq
	 * Center = Centro
	 */
	JButton btnCerrar;
	
	public Ventana() {
		super();
		
		setBounds(200, 200, 600, 400); // Localizacion y tamaño de la ventana
		setResizable(false); // Para que no se pueda redimensionar
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // Para que cuando le das a la X de la ventan que no se cierre
		
		ImageIcon im = new ImageIcon("C:\\Users\\zJson\\Desktop\\Universidad\\1yr\\SegundoSemestre\\Programación\\java\\Academia\\img\\Logo.png");// Para poner el logo en la ventana
		setIconImage(im.getImage());
		
		// Poner boton en la parte sur de la ventana
		btnCerrar = new JButton("Cerrar");
		getContentPane().add(btnCerrar, BorderLayout.SOUTH);
		
		btnCerrar.addActionListener(new ActionListener() { // Hacer que funcione el botón.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true); // Siempre tiene que ir al final, esto es para que sea visible
	}
}
