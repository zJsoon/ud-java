package window.logged;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import window.logged.films.WindowFilms;
import window.logged.series.WindowSeries;

public class WindowLogged extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel pCentre, pSouth, pSeries, pFilms;
	private JButton btnSeries, btnFilms, btnClose;
	
	public WindowLogged() {
		super();
		
		/*WINDOW*/
		setBounds(400, 150, 1000, 800);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		/*TITLE*/
		setTitle("TV | Films DataBase - Home");
		
		/*IMG TITLE*/
		ImageIcon im = new ImageIcon("./img/logo.png");
		setIconImage(im.getImage());
		
		/*CREATE PANELS*/
		pCentre = new JPanel();
		pSouth = new JPanel();
		pSeries = new JPanel();
		pFilms = new JPanel();
		
		/*CREATE BUTTONS*/
		btnSeries = new JButton("SERIES");
		btnFilms = new JButton("FILMS");
		btnClose = new JButton("Close");
		
		/*ADD COMPONENTS*/
		pSeries.add(btnSeries);
		pFilms.add(btnFilms);
		
		pCentre.add(pSeries);
		pCentre.add(pFilms);
		pSouth.add(btnClose);
		
		getContentPane().add(pCentre, BorderLayout.CENTER);
		getContentPane().add(pSouth, BorderLayout.SOUTH);
		
		/*EVENTOS*/
		/*BUTTON CLOSE*/
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		/*BUTTON SERIES*/
		btnSeries.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new WindowSeries();
			}
		});
		/*BUTTON FILMS*/
		btnFilms.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new WindowFilms();
			}
		});
		setVisible(true);
	}
}
