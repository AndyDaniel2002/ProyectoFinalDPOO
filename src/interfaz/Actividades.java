package interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

public class Actividades extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7040183037098611344L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividades frame = new Actividades();
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
	public Actividades() {
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 321);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Actividades Investigativas");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Investigaciones ventana = new Investigaciones();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(101, 100, 315, 48);
		contentPane.add(btnNewButton);
		
		JButton btnCursosDePosgrado = new JButton("Cursos de Posgrado");
		btnCursosDePosgrado.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCursosDePosgrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							dispose();
							CursoPosgrado frame = new CursoPosgrado();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCursosDePosgrado.setBackground(Color.WHITE);
		btnCursosDePosgrado.setBounds(101, 159, 315, 48);
		contentPane.add(btnCursosDePosgrado);
		
		JButton btnMaestra = new JButton("Maestr\u00EDa");
		btnMaestra.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMaestra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							dispose();
							Maestria frame = new Maestria();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnMaestra.setBackground(Color.WHITE);
		btnMaestra.setBounds(101, 218, 315, 48);
		contentPane.add(btnMaestra);
		
		JLabel lblVicedecanatoDeInvestigaciones = new JLabel("Vicedecanato de Investigaciones y Posgrado");
		lblVicedecanatoDeInvestigaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblVicedecanatoDeInvestigaciones.setFont(new Font("Arial", Font.BOLD, 17));
		lblVicedecanatoDeInvestigaciones.setBounds(55, 11, 407, 25);
		contentPane.add(lblVicedecanatoDeInvestigaciones);
		
		JLabel lblDeLaFacultad = new JLabel("de la Facultad de Ingieneria Inform\u00E1tica");
		lblDeLaFacultad.setFont(new Font("Arial", Font.BOLD, 17));
		lblDeLaFacultad.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeLaFacultad.setBounds(55, 39, 384, 25);
		contentPane.add(lblDeLaFacultad);
		
		JLabel lblSellecioneLaOpcion = new JLabel("Selecione la opcion que desee gestionar:");
		lblSellecioneLaOpcion.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSellecioneLaOpcion.setBounds(34, 64, 373, 25);
		contentPane.add(lblSellecioneLaOpcion);
	}
}
