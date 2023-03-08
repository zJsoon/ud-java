package Clase_03.ventanas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel pSur, pCentro;
	private JButton btnMoverDibujo;
	private JLabel lblFoto;
	
	public Ventana(){
		super();
		setBounds(0, 0, 1920, 1080);
		setTitle("Skyline Project");
		ImageIcon im = new ImageIcon("C:\\Users\\zJson\\Desktop\\Universidad\\1yr\\SegundoSemestre\\Programación\\java\\Academia\\img\\Logo.png");// Para poner el logo en la ventana
		setIconImage(im.getImage());
		
		/*Cración de paneles*/
		pSur = new JPanel();
		pCentro = new JPanel();
		
		/*AÑADIR PANELES A LA VENTANA*/
		getContentPane().add(pSur, BorderLayout.SOUTH);
		getContentPane().add(pCentro, BorderLayout.CENTER);
		 
		/*CREACIÓN DE LOS COMPONENTES*/
		btnMoverDibujo = new JButton("MOVER DIBUJO");
		ImageIcon img = new ImageIcon("C:\\Users\\zJson\\Desktop\\Universidad\\1yr\\SegundoSemestre\\Programación\\java\\Academia\\img\\Logo.png");
		lblFoto = new JLabel(img);
		
		/*AÑADIR JLABEL AL PANEL CENTRO*/
		pCentro.add(lblFoto);
		
		/*AÑADIR EL BOTÓN AL PANEL SUR*/
		pSur.add(btnMoverDibujo);
		
		/* EVENTOS */
		btnMoverDibujo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int xCoord = lblFoto.getX();
				int yCoord = lblFoto.getY();
				int anchoCoord = lblFoto.getWidth();
				int altocoord = lblFoto.getHeight();
				xCoord += 50;
				lblFoto.setBounds(xCoord, yCoord, anchoCoord, altocoord);
			}
		});
		
		setVisible(true);
	}
}
