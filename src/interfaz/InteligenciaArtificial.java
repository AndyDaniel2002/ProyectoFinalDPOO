package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class InteligenciaArtificial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6375916741390371542L;
	private JPanel contentPane;
	private JLabel lblRegistros;
	private JButton btnAtras;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblResponsable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InteligenciaArtificial frame = new InteligenciaArtificial();
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
	public InteligenciaArtificial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Inicio>Actividades Investigativas>Inteligencia Artificial");
		setBounds(100, 100, 679, 324);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAgregar = new JMenu("Agregar");
		menuBar.add(mnAgregar);
		
		JMenuItem mntmAgregarInvestigador = new JMenuItem("Inicio>Actividades Investigativas>Agregar Investigador");
		mntmAgregarInvestigador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Agregar_Inves ventana = new Agregar_Inves();
				ventana.setVisible(true);
			}
		});
		mnAgregar.add(mntmAgregarInvestigador);
		
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
		
		JMenu mnModificarInvestigador = new JMenu("Modificar Investigador");
		mnModificar.add(mnModificarInvestigador);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblRegistros());
		contentPane.add(getBtnAtras());
		contentPane.add(getScrollPane());
		contentPane.add(getLblResponsable());
	}

	private JLabel getLblRegistros() {
		if (lblRegistros == null) {
			lblRegistros = new JLabel("Registros");
			lblRegistros.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistros.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
			lblRegistros.setBounds(215, 27, 242, 38);
		}
		return lblRegistros;
	}
	private JButton getBtnAtras() {
		if (btnAtras == null) {
			btnAtras = new JButton("Atr\u00E1s");
			btnAtras.setBackground(Color.WHITE);
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Investigaciones ventana = new Investigaciones();
					ventana.setVisible(true);
					dispose();
				}
			});
			btnAtras.setFont(new Font("Arial", Font.PLAIN, 14));
			btnAtras.setBounds(487, 244, 120, 27);
		}
		return btnAtras;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(15, 122, 643, 92);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"Cecilia Salazar", "Master", "Profesor Titular", "Computadoras", "3 puntos", 2},
					{"Maritza Yons", "Doctor", "Profesor Tiular", "Softwares", "10puntos", 1},
					{"Eugenio Rodriguez", "Doctor", "Profesor Titular", "Redes", "8 puntos", 4},
					{"Orlando Tellez", "Doctor", "Instructor", "Seguridad inf.", "10 puntos", 2},
				},
				new String[] {
					"Nombre y Apellidos", "Categoria Cientifica", "Categoria Docente", "Tema de Investig.", "Resultados Inv.", "Articulos Publicados"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(112);
			table.getColumnModel().getColumn(1).setPreferredWidth(110);
			table.getColumnModel().getColumn(2).setPreferredWidth(108);
			table.getColumnModel().getColumn(3).setPreferredWidth(104);
			table.getColumnModel().getColumn(4).setPreferredWidth(98);
			table.getColumnModel().getColumn(5).setPreferredWidth(109);
			table.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		}
		return table;
	}
	private JLabel getLblResponsable() {
		if (lblResponsable == null) {
			lblResponsable = new JLabel("Responsable:    Pedro Fgueroa");
			lblResponsable.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			lblResponsable.setBounds(44, 74, 315, 23);
		}
		return lblResponsable;
	}
}
