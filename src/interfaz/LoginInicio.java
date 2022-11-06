package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class LoginInicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3306975889008814167L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginInicio frame = new LoginInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginInicio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JLabel lblNewLabel = new JLabel("Usuario o Correo");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblNewLabel.setBounds(48, 22, 118, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(48, 57, 245, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBackground(Color.BLACK);
		lblContrasea.setForeground(Color.BLACK);
		lblContrasea.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		lblContrasea.setBounds(48, 100, 82, 14);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(48, 132, 245, 20);
		contentPane.add(passwordField);
		
		final JLabel error = new JLabel("Usuario o contra\u00F1a incorrecto");
		error.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		error.setForeground(Color.RED);
		error.setBackground(Color.RED);
		error.setBounds(48, 179, 220, 20);
		error.setVisible(false);
		contentPane.add(error);
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = textField.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				
				if(usuarioValido(user, password)){
					Actividades ventana = new Actividades();
					ventana.setVisible(true);
					dispose();
				}else{
					error.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(31, 232, 135, 38);
		btnNewButton.setBackground(Color.white);
		contentPane.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(176, 232, 135, 38);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario admin");
		lblNewLabel_1.setBounds(48, 210, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPasswordAdmin = new JLabel("password admin");
		lblPasswordAdmin.setBounds(140, 210, 108, 14);
		contentPane.add(lblPasswordAdmin);
	}
	
	private boolean usuarioValido(String usuario, String password){
		boolean flag = false;
		
		if(usuario.equals("admin") && password.equals("admin")){
			flag = true;
		}else{
			flag = false;
		}
		
		return flag;
	}
}












