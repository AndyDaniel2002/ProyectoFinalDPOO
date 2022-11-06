package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Maestria extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9077708955025096906L;
	private JPanel contentPane;
	private JButton btnCursoPosgradoInteligencia;
	private JButton btnCursoPosgradoIngieneria;
	private JButton btnAsignaturaAdministracionDe;
	private JLabel lblPlanDeEstudio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maestria frame = new Maestria();
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
	public Maestria() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Inicio>Maestria");
		setBounds(100, 100, 471, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnCursoPosgradoInteligencia());
		contentPane.add(getBtnCursoPosgradoIngieneria());
		contentPane.add(getBtnAsignaturaAdministracionDe());
		contentPane.add(getLblPlanDeEstudio());
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBackground(Color.WHITE);
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Actividades ventana = new Actividades();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnAtrs.setBounds(350, 294, 89, 23);
		contentPane.add(btnAtrs);
	}

	private JButton getBtnCursoPosgradoInteligencia() {
		if (btnCursoPosgradoInteligencia == null) {
			btnCursoPosgradoInteligencia = new JButton("Curso Posgrado. Inteligencia Artificial");
			btnCursoPosgradoInteligencia.setBackground(Color.WHITE);
			btnCursoPosgradoInteligencia.addActionListener(new ActionListener() {
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
			btnCursoPosgradoInteligencia.setFont(new Font("Arial", Font.PLAIN, 15));
			btnCursoPosgradoInteligencia.setBounds(54, 61, 340, 62);
		}
		return btnCursoPosgradoInteligencia;
	}
	private JButton getBtnCursoPosgradoIngieneria() {
		if (btnCursoPosgradoIngieneria == null) {
			btnCursoPosgradoIngieneria = new JButton("Curso Posgrado. Ingieneria De Software");
			btnCursoPosgradoIngieneria.setBackground(Color.WHITE);
			btnCursoPosgradoIngieneria.addActionListener(new ActionListener() {
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
			btnCursoPosgradoIngieneria.setFont(new Font("Arial", Font.PLAIN, 15));
			btnCursoPosgradoIngieneria.setBounds(54, 134, 340, 62);
		}
		return btnCursoPosgradoIngieneria;
	}
	private JButton getBtnAsignaturaAdministracionDe() {
		if (btnAsignaturaAdministracionDe == null) {
			btnAsignaturaAdministracionDe = new JButton("Asignatura. Administracion de Redes");
			btnAsignaturaAdministracionDe.setBackground(Color.WHITE);
			btnAsignaturaAdministracionDe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								dispose();
								AdminRedes frame = new AdminRedes();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			});
			btnAsignaturaAdministracionDe.setFont(new Font("Arial", Font.PLAIN, 15));
			btnAsignaturaAdministracionDe.setBounds(54, 207, 340, 62);
		}
		return btnAsignaturaAdministracionDe;
	}
	private JLabel getLblPlanDeEstudio() {
		if (lblPlanDeEstudio == null) {
			lblPlanDeEstudio = new JLabel("PLAN DE ESTUDIO");
			lblPlanDeEstudio.setFont(new Font("Arial", Font.BOLD, 15));
			lblPlanDeEstudio.setHorizontalAlignment(SwingConstants.CENTER);
			lblPlanDeEstudio.setBounds(130, 11, 188, 39);
		}
		return lblPlanDeEstudio;
	}
}
