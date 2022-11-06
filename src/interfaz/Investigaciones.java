package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Investigaciones extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Investigaciones frame = new Investigaciones();
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
	public Investigaciones() {
		setTitle("Inicio>Actividades Investigativas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lineas de Investigaci\u00F3n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(86, 21, 244, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ingenier\u00EDa de Software");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							dispose();
							IgenieriaDeSoftware frame = new IgenieriaDeSoftware();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(59, 68, 316, 52);
		contentPane.add(btnNewButton);
		
		JButton btnInteligenciaArtificial = new JButton("Inteligencia Artificial");
		btnInteligenciaArtificial.setFont(new Font("Arial", Font.PLAIN, 16));
		btnInteligenciaArtificial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							dispose();
							InteligenciaArtificial frame = new InteligenciaArtificial();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnInteligenciaArtificial.setBackground(Color.WHITE);
		btnInteligenciaArtificial.setBounds(59, 143, 316, 52);
		contentPane.add(btnInteligenciaArtificial);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Actividades ventana = new Actividades();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnAtras.setBounds(301, 227, 89, 23);
		contentPane.add(btnAtras);
	}

}
