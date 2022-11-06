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

public class AdminRedes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8258013397790448986L;
	private JPanel contentPane;
	private JLabel lblRegistros;
	private JButton btnAtras;
	private JScrollPane scrollPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnModificar;
	private JMenuItem mntmModificarDocente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRedes frame = new AdminRedes();
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
	public AdminRedes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Inicio>Maestria> Administracion de Redes");
		setBounds(100, 100, 502, 362);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblRegistros());
		contentPane.add(getBtnAtras());
		contentPane.add(getScrollPane());
	}

	private JLabel getLblRegistros() {
		if (lblRegistros == null) {
			lblRegistros = new JLabel("Registros");
			lblRegistros.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegistros.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
			lblRegistros.setBounds(140, 24, 216, 42);
		}
		return lblRegistros;
	}
	private JButton getBtnAtras() {
		if (btnAtras == null) {
			btnAtras = new JButton("Atras");
			btnAtras.setBackground(Color.WHITE);
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Maestria ventana = new Maestria();
					ventana.setVisible(true);
					dispose();
				}
			});
			btnAtras.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
			btnAtras.setBounds(358, 279, 89, 23);
		}
		return btnAtras;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(41, 105, 414, 107);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"Marcos Prado", null, "Titular", new Integer(15)},
					{"Leonardo Perez", null, "Profesor Titular", new Integer(20)},
					{"Zoila Gutierrez", null, "Asistente", new Integer(10)},
					{"Daniel Duran", null, "Asistente", new Integer(25)},
					{"Sandra Lazo", null, "Profesor Auxiliar", new Integer(20)},
				},
				new String[] {
					"Nombre y Apellidos", "Categoria Cientifica", "Categoria Docente", "Creditos"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(130);
			table.getColumnModel().getColumn(1).setPreferredWidth(111);
			table.getColumnModel().getColumn(2).setPreferredWidth(120);
			table.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		}
		return table;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnModificar());
		}
		return menuBar;
	}
	private JMenu getMnModificar() {
		if (mnModificar == null) {
			mnModificar = new JMenu("Modificar");
			mnModificar.add(getMntmModificarDocente());
		}
		return mnModificar;
	}
	private JMenuItem getMntmModificarDocente() {
		if (mntmModificarDocente == null) {
			mntmModificarDocente = new JMenuItem("Modificar Docente");
		}
		return mntmModificarDocente;
	}
}
