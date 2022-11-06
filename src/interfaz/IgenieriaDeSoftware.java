package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class IgenieriaDeSoftware extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8152489485948823751L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IgenieriaDeSoftware frame = new IgenieriaDeSoftware();
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
	public IgenieriaDeSoftware() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 354);
		setResizable(false);
		setTitle("Inicio>Actividades Investigativas>Ingenieria de Software");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAgregar = new JMenu("Agregar");
		menuBar.add(mnAgregar);
		
		JMenuItem mntmAgregarDocente = new JMenuItem("Agregar Invesitgador");
		mntmAgregarDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Agregar_Inves ventana = new Agregar_Inves();
				ventana.setVisible(true);
			}
		});
		mnAgregar.add(mntmAgregarDocente);
		
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
		
		JMenuItem mntmModificarDocente = new JMenuItem("Modificar Investigador");
		mnModificar.add(mntmModificarDocente);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResponsable = new JLabel("Responsable :");
		lblResponsable.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblResponsable.setBounds(30, 72, 115, 28);
		contentPane.add(lblResponsable);
		
		JLabel lblNewLabel = new JLabel("Mar\u00EDa Castillo Fernand\u00E9z");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel.setBounds(155, 76, 269, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Atr\u00E1s");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Investigaciones ventana = new Investigaciones();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(497, 255, 97, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblRegistros = new JLabel("Registros");
		lblRegistros.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistros.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
		lblRegistros.setBounds(237, 11, 180, 41);
		contentPane.add(lblRegistros);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 128, 624, 91);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Rosa Betancourt", "Doctor", "Instructor", "Softwares", "10", "1"},
				{"Miguel de Cervante", "Master", "Asistente", "Redes", "5", "5"},
				{"Paula Mejide", "Master", "Instructor", "Seguridad Inf.", "10", "2"},
				{"Mercedes Mendoca", "Doctor", "Profesor Titular", "Computadoras", "8", null},
			},
			new String[] {
				"Nombre y Apellidos", "Categoria Cientifica", "Categoria Docente", "Tema de Inv.", "Resultados Inv.", "Articulos Publicados"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(121);
		table.getColumnModel().getColumn(1).setPreferredWidth(114);
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(5).setPreferredWidth(106);
		table.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
	}
}
