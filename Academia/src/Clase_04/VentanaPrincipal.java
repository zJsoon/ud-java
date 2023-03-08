package Clase_04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel pSur, pCentro, pCentroIzq, pCentroDrc, p1, p2, p3, p4, p5, p6, p7;
	private JLabel lblLogin, lblRegister, lblDniLogin, lblPassLogin, lblDniRegister, lblNomRegister, lblPassRegister;
	private JButton btnCerrar, btnLogin, btnRegister;
	private JTextField txtDniLogin, txtDniRegister, txtNomRegister;
	private JPasswordField txtPassLogin, txtPassRegister;
	
	private ArrayList<Cliente> listaCliente;
	
	public VentanaPrincipal() {
		super();
		listaCliente = new ArrayList<Cliente>();
		
		setBounds(200, 200, 800, 600);
		setTitle("Login | Register");
		ImageIcon im = new ImageIcon("C:\\Users\\zJson\\Desktop\\Universidad\\1yr\\SegundoSemestre\\Programación\\java\\Academia\\img\\Logo.png");// Para poner el logo en la ventana
		setIconImage(im.getImage());
		setResizable(false); // Para que no se pueda redimensionar
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		
		
		/*CREACIÓN DE LOS PANELES*/
		
		pSur = new JPanel();
		pCentro = new JPanel();
		pCentroIzq = new JPanel();
		pCentroDrc = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		btnCerrar = new JButton("Cerrar");
		
		getContentPane().add(pSur, BorderLayout.SOUTH);	
		pSur.add(btnCerrar);
		btnCerrar.addActionListener(new ActionListener() { // Hacer que funcione el botón.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		/*ASIGNAR LOS LAYOUTS*/
		pCentro.setLayout(new GridLayout(1, 2));
		pCentroIzq.setLayout(new GridLayout(4, 1));
		pCentroDrc.setLayout(new GridLayout(5, 1));
		
		/*CREACIÓN DE LOS COMPONENTES*/
		
		/*LOGIN*/
		lblLogin = new JLabel("LOGIN");
		lblDniLogin = new JLabel("DNI: ");
		txtDniLogin = new JTextField(20);
		lblPassLogin = new JLabel("PASS: ");
		txtPassLogin = new JPasswordField(20);
		btnLogin = new JButton("LOGIN");
			
		/*REGISTER*/
		lblRegister = new JLabel("REGISTER");
		lblDniRegister = new JLabel("DNI: ");
		txtDniRegister = new JTextField(20);
		lblNomRegister = new JLabel("NAME: ");
		txtNomRegister = new JTextField(20);
		lblPassRegister = new JLabel("PASS: ");
		txtPassRegister = new JPasswordField(20);
		btnRegister = new JButton("REGISTER");
		
		/*AÑADIR COMPONENTES A LOS PANELES*/
		
		/*LOGIN*/
		pCentroIzq.add(lblLogin);
		
		p1.add(lblDniLogin);
		p1.add(txtDniLogin);
		pCentroIzq.add(p1);
		
		p2.add(lblPassLogin);
		p2.add(txtPassLogin);
		pCentroIzq.add(p2);
		
		p6.add(btnLogin);
		pCentroIzq.add(p6);
		
		pCentro.add(pCentroIzq);
		
		/*REGISTER*/
		pCentroDrc.add(lblRegister);
		
		p3.add(lblNomRegister);
		p3.add(txtNomRegister);
		pCentroDrc.add(p3);
		
		p4.add(lblDniRegister);
		p4.add(txtDniRegister);
		pCentroDrc.add(p4);
		
		p5.add(lblPassRegister);
		p5.add(txtPassRegister);
		pCentroDrc.add(p5);
		
		p7.add(btnRegister);
		pCentroDrc.add(p7);
		
		pCentro.add(pCentroDrc);
		
		getContentPane().add(pCentro, BorderLayout.CENTER);
		
		/*EVENTOS*/
		
		btnRegister.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String dni = txtDniRegister.getText();
				String nom = txtNomRegister.getText();
				String pass = txtPassRegister.getText();
				
				Cliente c = new Cliente(dni, nom, pass);
				listaCliente.add(c);
				JOptionPane.showMessageDialog(null, "You have successfully registered.");
			}
		});
		
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean enc = false;
				int cont = 0;

				String dni = txtDniLogin.getText();
				String pass = txtPassLogin.getText();
				Cliente c = null;
				
				while(enc == false && cont<listaCliente.size()) {
					c = listaCliente.get(cont);
					
					if (c.getDni().equals(dni)) {
						enc = true;
					} else {
						cont++;
					}
				}
				if(enc == false) {
					JOptionPane.showMessageDialog(null, "WRONG! Not registered.");
				} else {
					if(c.getPass().equals(pass)) {
						JOptionPane.showMessageDialog(null, "You have successfully logged.");
						dispose();
						new VentanaLogged();
						
					}else {
						JOptionPane.showMessageDialog(null, "WRONG!, The password is incorrect.");
					}
				}
			}
		});
		setVisible(true);
	}
}
