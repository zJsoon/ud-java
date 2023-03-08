package window.loginRegister;

import users.Users;
import window.logged.WindowLogged;

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

public class WindowLoginRegister extends JFrame{
	private static final long serialVersionUID = 1L;

	private JPanel pCentre, pCentreLeft, pCentreRigth, pSouth, pDniLogin, pPassLogin, pBtnLogin, pNomRegister, pDniRegister, pPassRegister, pBtnRegister;
	private JLabel lblLogin, lblRegister, lblDniLogin, lblPassLogin, lblDniRegister, lblNomRegister, lblPassRegister;
	private JButton btnClose, btnLogin, btnRegister;
	private JTextField txtDniLogin, txtDniRegister, txtNameRegister;
	private JPasswordField passLogin, passRegister;

	private ArrayList<Users>userList;

	public WindowLoginRegister(){
		super();
		userList = new ArrayList<Users>();

		/*WINDOW*/
		setBounds(400, 150, 1000, 800);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		/*TITLE*/
		setTitle("TV | Films DataBase - Login/Register");

		/*IMG TITLE*/
		ImageIcon im = new ImageIcon("C:/Users/zJson/Desktop/java/Project/img/logo.png");
		setIconImage(im.getImage());

		/*CREATE PANELS*/
		pSouth = new JPanel();
		pCentre = new JPanel();
		pCentreLeft = new JPanel();
		pCentreRigth = new JPanel();
		pDniLogin = new JPanel();
		pPassLogin = new JPanel();
		pBtnLogin = new JPanel();
		pNomRegister = new JPanel();
		pDniRegister = new JPanel();
		pPassRegister = new JPanel();
		pBtnRegister = new JPanel();
		
		/*CREATE BUTTONS*/
		btnClose = new JButton("Close");

		/*LAYOUTS*/
		pCentre.setLayout(new GridLayout(1,2));
		pCentreLeft.setLayout(new GridLayout(4,1));
		pCentreRigth.setLayout(new GridLayout(5,1));

		/*COMPONENTS*/
		/*LOGIN*/
		lblLogin = new JLabel("LOGIN");
		lblDniLogin = new JLabel("DNI: ");
		txtDniLogin = new JTextField(20);
		lblPassLogin = new JLabel("PASS: ");
		passLogin = new JPasswordField(20);
		btnLogin = new JButton("LOGIN");
		/*REGISTER*/
		lblRegister = new JLabel("REGISTER");
		lblDniRegister = new JLabel("DNI: ");
		txtDniRegister = new JTextField(20);
		lblNomRegister = new JLabel("NAME: ");
		txtNameRegister = new JTextField(20);
		lblPassRegister = new JLabel("PASS: ");
		passRegister = new JPasswordField(20);
		btnRegister = new JButton("REGISTER");

		/*ADD COMPONENTS*/
		/*LOGIN*/
		pCentreLeft.add(lblLogin);

		pDniLogin.add(lblDniLogin);
		pDniLogin.add(txtDniLogin);
		pPassLogin.add(lblPassLogin);
		pPassLogin.add(passLogin);
		pBtnLogin.add(btnLogin);
		
		pCentreLeft.add(pDniLogin);
		pCentreLeft.add(pPassLogin);
		pCentreLeft.add(pBtnLogin);


		/*REGISTER*/
		pCentreRigth.add(lblRegister);

		pNomRegister.add(lblNomRegister);
		pNomRegister.add(txtNameRegister);
		pDniRegister.add(lblDniRegister);
		pDniRegister.add(txtDniRegister);
		pPassRegister.add(lblPassRegister);
		pPassRegister.add(passRegister);
		pBtnRegister.add(btnRegister);
		
		pCentreRigth.add(pNomRegister);
		pCentreRigth.add(pDniRegister);
		pCentreRigth.add(pPassRegister);
		pCentreRigth.add(pBtnRegister);

		
		pCentre.add(pCentreLeft);
		pCentre.add(pCentreRigth);
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

		/*REGISTER*/
		btnRegister.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				String dni = txtDniRegister.getText();
				String name = txtNameRegister.getText();
				String pass = passRegister.getText();

				Users u = new Users(name, dni, pass);
				userList.add(u);
				JOptionPane.showMessageDialog(null, "You have successfully registered.");
			}
		});

		/*LOGIN*/
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean find = false;
				int cont = 0;

				String dni = txtDniLogin.getText();
				String pass = passRegister.getText();

				Users u = null;
				while(find == false && cont<userList.size()) {
					u = userList.get(cont);

					if(u.getDni().equals(dni)) {
						find = true;
					} else {
						cont++;
					}
				}
				if(find == false) {
					JOptionPane.showMessageDialog(null, "WRONG! Not registered.");
				}else {
					if(u.getPass().equals(pass)) {
						JOptionPane.showMessageDialog(null, "You have successfully logged.");
						dispose();
						new WindowLogged();
					}else {
						JOptionPane.showMessageDialog(null, "WRONG! The password is incorrect.");
					}
				}
			}
		});
		/*VISIBILITY*/
		setVisible(true);
	}
}
