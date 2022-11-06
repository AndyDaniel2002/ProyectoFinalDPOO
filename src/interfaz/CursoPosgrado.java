package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CursoPosgrado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnIngieneriaDeSoftware;
	private JButton btnInteligenciaArtificial;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CursoPosgrado frame = new CursoPosgrado();
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
	public CursoPosgrado() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Inicio>Cursos de Posgrado");
		setBounds(100, 100, 516, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnIngieneriaDeSoftware());
		contentPane.add(getBtnInteligenciaArtificial());
		contentPane.add(getBtnNewButton());
	}
	private JButton getBtnIngieneriaDeSoftware() {
		if (btnIngieneriaDeSoftware == null) {
			btnIngieneriaDeSoftware = new JButton("Ingieneria de Software");
			btnIngieneriaDeSoftware.setBackground(Color.WHITE);
			btnIngieneriaDeSoftware.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								dispose();
								CPingSoftware frame = new CPingSoftware();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			});
			btnIngieneriaDeSoftware.setFont(new Font("Arial", Font.PLAIN, 15));
			btnIngieneriaDeSoftware.setBounds(95, 60, 293, 71);
		}
		return btnIngieneriaDeSoftware;
	}
	private JButton getBtnInteligenciaArtificial() {
		if (btnInteligenciaArtificial == null) {
			btnInteligenciaArtificial = new JButton("Inteligencia Artificial");
			btnInteligenciaArtificial.setBackground(Color.WHITE);
			btnInteligenciaArtificial.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								dispose();
								CPintArtificial frame = new CPintArtificial();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			});
			btnInteligenciaArtificial.setFont(new Font("Arial", Font.PLAIN, 15));
			btnInteligenciaArtificial.setBounds(95, 181, 293, 71);
		}
		return btnInteligenciaArtificial;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Atr\u00E1s");
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Actividades ventana = new Actividades();
					ventana.setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBounds(374, 291, 89, 23);
		}
		return btnNewButton;
	}
}
