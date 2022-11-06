package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class CPingSoftware extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3639119571131882264L;
	private JPanel contentPane;
	private JLabel lblRegistros;
	private JLabel lblImpartidoPor;
	private JTextField txtMariaDeMendive;
	private JLabel lblTema;
	private JLabel lblCreditos;
	private JTextField txtLosSoftwares;
	private JSpinner spinner;
	private JButton btnAtras;
	private JScrollPane scrollPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnAgregar;
	private JMenu mnModificar;
	private JMenuItem mntmAgregarDocente;
	private JMenuItem mntmModificarDocente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CPingSoftware frame = new CPingSoftware();
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
	public CPingSoftware() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Inicio>Cursos de Posgrado>Ingieneria de Software");
		setBounds(100, 100, 517, 429);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblRegistros());
		contentPane.add(getLblImpartidoPor());
		contentPane.add(getTxtMariaDeMendive());
		contentPane.add(getLblTema());
		contentPane.add(getLblCreditos());
		contentPane.add(getTxtLosSoftwares());
		contentPane.add(getSpinner());
		contentPane.add(getBtnAtras());
		contentPane.add(getScrollPane_1());
	}

	private JLabel getLblRegistros() {
		if (lblRegistros == null) {
			lblRegistros = new JLabel("Registros");
			lblRegistros.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
			lblRegistros.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistros.setBounds(175, 11, 161, 46);
		}
		return lblRegistros;
	}
	private JLabel getLblImpartidoPor() {
		if (lblImpartidoPor == null) {
			lblImpartidoPor = new JLabel("Impartido por:");
			lblImpartidoPor.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			lblImpartidoPor.setBounds(10, 79, 120, 14);
		}
		return lblImpartidoPor;
	}
	private JTextField getTxtMariaDeMendive() {
		if (txtMariaDeMendive == null) {
			txtMariaDeMendive = new JTextField();
			txtMariaDeMendive.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			txtMariaDeMendive.setText("Maria de Mendive");
			txtMariaDeMendive.setBounds(140, 78, 224, 20);
			txtMariaDeMendive.setColumns(10);
		}
		return txtMariaDeMendive;
	}
	private JLabel getLblTema() {
		if (lblTema == null) {
			lblTema = new JLabel("Tema:");
			lblTema.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			lblTema.setBounds(10, 111, 120, 20);
		}
		return lblTema;
	}
	private JLabel getLblCreditos() {
		if (lblCreditos == null) {
			lblCreditos = new JLabel("Creditos");
			lblCreditos.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			lblCreditos.setBounds(10, 144, 107, 20);
		}
		return lblCreditos;
	}
	private JTextField getTxtLosSoftwares() {
		if (txtLosSoftwares == null) {
			txtLosSoftwares = new JTextField();
			txtLosSoftwares.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			txtLosSoftwares.setText("Los Softwares");
			txtLosSoftwares.setBounds(140, 113, 224, 20);
			txtLosSoftwares.setColumns(10);
		}
		return txtLosSoftwares;
	}
	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			spinner.setBounds(140, 144, 94, 20);
		}
		return spinner;
	}
	private JButton getBtnAtras() {
		if (btnAtras == null) {
			btnAtras = new JButton("Atras");
			btnAtras.setBackground(Color.WHITE);
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					CursoPosgrado ventana = new CursoPosgrado();
					ventana.setVisible(true);
					dispose();
				}
			});
			btnAtras.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			btnAtras.setBounds(379, 353, 89, 23);
		}
		return btnAtras;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(45, 187, 420, 108);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"Victor Delgado", null, "Asistente", 3},
					{"Luisa Ferrer", "Master", "Profesor Tiular", 3},
					{"Kendry Carrazco", "Master", "Profesor Titular", 4},
					{"Penelope Cruz", null, "Instructor", 5},
					{"Hector Villanueva", "Master", "Asistente", 5},
				},
				new String[] {
					"Nombre y Apellidos", "Categoria Cientifica", "Categoria Docente", "Nota"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(104);
			table.getColumnModel().getColumn(1).setPreferredWidth(107);
			table.getColumnModel().getColumn(2).setPreferredWidth(105);
			table.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		}
		return table;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnAgregar());
			menuBar.add(getMnModificar());
		}
		return menuBar;
	}
	private JMenu getMnAgregar() {
		if (mnAgregar == null) {
			mnAgregar = new JMenu("Agregar");
			mnAgregar.add(getMntmAgregarDocente());
		}
		return mnAgregar;
	}
	private JMenu getMnModificar() {
		if (mnModificar == null) {
			mnModificar = new JMenu("Modificar");
			mnModificar.add(getMntmModificarDocente());
		}
		return mnModificar;
	}
	private JMenuItem getMntmAgregarDocente() {
		if (mntmAgregarDocente == null) {
			mntmAgregarDocente = new JMenuItem("Agregar Docente");
			mntmAgregarDocente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Agregar_Docente ventana = new Agregar_Docente();
					ventana.setVisible(true);
				}
			});
		}
		return mntmAgregarDocente;
	}
	private JMenuItem getMntmModificarDocente() {
		if (mntmModificarDocente == null) {
			mntmModificarDocente = new JMenuItem("Modificar Docente");
		}
		return mntmModificarDocente;
	}
}
