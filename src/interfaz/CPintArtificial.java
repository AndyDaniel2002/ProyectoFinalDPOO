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
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class CPintArtificial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1499104383854791912L;
	private JPanel contentPane;
	private JLabel lblRegistros;
	private JLabel lblImpartidoPor;
	private JTextField txtMargaritaSanchezCorrioso;
	private JLabel lblTema;
	private JTextField txtLosHologramas;
	private JLabel lblCreditos;
	private JSpinner spinner;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnAtras;
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
					CPintArtificial frame = new CPintArtificial();
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
	public CPintArtificial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Inicio>Cursos de Posgrado>Inteligencia Artificial");
		setBounds(100, 100, 520, 387);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblRegistros());
		contentPane.add(getLblImpartidoPor());
		contentPane.add(getTxtMargaritaSanchezCorrioso());
		contentPane.add(getLblTema());
		contentPane.add(getTxtLosHologramas());
		contentPane.add(getLblCreditos());
		contentPane.add(getSpinner());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnAtras());
	}

	private JLabel getLblRegistros() {
		if (lblRegistros == null) {
			lblRegistros = new JLabel("Registros");
			lblRegistros.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
			lblRegistros.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistros.setBounds(192, 11, 129, 32);
		}
		return lblRegistros;
	}
	private JLabel getLblImpartidoPor() {
		if (lblImpartidoPor == null) {
			lblImpartidoPor = new JLabel("Impartido por:");
			lblImpartidoPor.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			lblImpartidoPor.setBounds(10, 62, 116, 24);
		}
		return lblImpartidoPor;
	}
	private JTextField getTxtMargaritaSanchezCorrioso() {
		if (txtMargaritaSanchezCorrioso == null) {
			txtMargaritaSanchezCorrioso = new JTextField();
			txtMargaritaSanchezCorrioso.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			txtMargaritaSanchezCorrioso.setText("Margarita Sanchez Corrioso");
			txtMargaritaSanchezCorrioso.setBounds(136, 62, 228, 24);
			txtMargaritaSanchezCorrioso.setColumns(10);
		}
		return txtMargaritaSanchezCorrioso;
	}
	private JLabel getLblTema() {
		if (lblTema == null) {
			lblTema = new JLabel("Tema:");
			lblTema.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			lblTema.setBounds(10, 97, 116, 24);
		}
		return lblTema;
	}
	private JTextField getTxtLosHologramas() {
		if (txtLosHologramas == null) {
			txtLosHologramas = new JTextField();
			txtLosHologramas.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			txtLosHologramas.setText("Los hologramas");
			txtLosHologramas.setBounds(136, 101, 228, 20);
			txtLosHologramas.setColumns(10);
		}
		return txtLosHologramas;
	}
	private JLabel getLblCreditos() {
		if (lblCreditos == null) {
			lblCreditos = new JLabel("Creditos");
			lblCreditos.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			lblCreditos.setBounds(10, 131, 116, 14);
		}
		return lblCreditos;
	}
	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinner.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			spinner.setBounds(136, 132, 67, 20);
		}
		return spinner;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(31, 178, 452, 107);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"Mariela Mendoza", "Master", "Instructor", 3},
					{"Carmen Lobo", null, "Profesor Auxiliar", 5},
					{"Andres Diaz", "Master", "Profesor Auxiliar", 2},
					{"Tamara Falco", null, "Profesor Titular", 4},
					{"Rodolfo Jimenez", null, "Asistente", 3},
				},
				new String[] {
					"Nombre y Apellidos", "Categoria Cientifica", "Categoria Docente", "Nota"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(110);
			table.getColumnModel().getColumn(1).setPreferredWidth(107);
			table.getColumnModel().getColumn(2).setPreferredWidth(103);
		}
		return table;
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
			btnAtras.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
			btnAtras.setBounds(364, 309, 89, 23);
		}
		return btnAtras;
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
