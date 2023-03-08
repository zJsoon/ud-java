package window.logged.series;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowSeries extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel pSouth;
	private JButton btnClose;
	public WindowSeries() {
		super();

		/*WINDOW*/
		setBounds(400, 150, 1000, 800);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		/*TITLE*/
		setTitle("TV | Films DataBase - Series");
		
		/*IMG TITLE*/
		ImageIcon im = new ImageIcon("C:/Users/zJson/Desktop/java/Project/img/logo.png");
		setIconImage(im.getImage());
		
		/*CREATE PANELS*/
		pSouth = new JPanel();
		
		/*CREATE BUTTONS*/
		btnClose = new JButton("Close");
		
		/*ADD COMPONENTS*/
		pSouth.add(btnClose);
		
		getContentPane().add(pSouth, BorderLayout.SOUTH);
		
		/*EVENTOS*/
		/*BUTTON CLOSE*/
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
}
