package interfaz;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Agregar_Inves extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1504276797423695441L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldDocente;
	private JTextField textFieldLinea;
	private JTextField textFieldTema;
	/**
	 * @wbp.nonvisual location=342,149
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblIdDocente;
	private JLabel lblLinea;
	private JLabel lblTema;
	private JLabel lblResultados;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Agregar_Inves dialog = new Agregar_Inves();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Agregar_Inves() {
		setTitle("Agrear Investigador");
		setBounds(100, 100, 450, 265);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 120);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblIdDocente = new JLabel("ID Docente");
		lblIdDocente.setBounds(7, 10, 141, 14);
		panel.add(lblIdDocente);
		
		lblLinea = new JLabel("L\u00EDnea de Investigaci\u00F3n");
		lblLinea.setBounds(7, 37, 141, 14);
		panel.add(lblLinea);
		
		lblTema = new JLabel("Tema de Investigaci\u00F3n");
		lblTema.setBounds(7, 61, 108, 14);
		panel.add(lblTema);
		
		lblResultados = new JLabel(" Resultados :");
		lblResultados.setBounds(7, 88, 141, 14);
		panel.add(lblResultados);
		
		textFieldDocente = new JTextField();
		textFieldDocente.setBounds(181, 7, 172, 20);
		panel.add(textFieldDocente);
		textFieldDocente.setColumns(10);
		
		textFieldLinea = new JTextField();
		textFieldLinea.setBounds(181, 31, 172, 20);
		textFieldLinea.setColumns(10);
		panel.add(textFieldLinea);
		
		textFieldTema = new JTextField();
		textFieldTema.setBounds(181, 55, 172, 20);
		textFieldTema.setColumns(10);
		panel.add(textFieldTema);
		
		rdbtnNewRadioButton = new JRadioButton("Con resultados");
		rdbtnNewRadioButton.setBounds(164, 84, 115, 23);
		panel.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Sin resultados");
		rdbtnNewRadioButton_1.setBounds(281, 84, 108, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 147, 414, 67);
		contentPanel.add(panel_1);
		
		JButton btnNewButton_1 = new JButton("Agregar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String idDocente = textFieldDocente.getText() ;
				String linea = textFieldLinea.getText();
				String tema = textFieldTema.getText();
				
				boolean isValid = validar(idDocente,linea,tema);
				
				if(isValid){
					if(rdbtnNewRadioButton.isSelected() || rdbtnNewRadioButton_1.isSelected()){
						if(rdbtnNewRadioButton.isSelected() == true){
							Resultados ventana = new Resultados();
							ventana.setVisible(true);
							dispose();
						}else{
							JOptionPane.showConfirmDialog(null, "Se agregó el investigador con exito",null, -1);
							dispose();
						}
					}else{
						lblResultados.setForeground(Color.RED);
					}
				}
			}
		});
		btnNewButton_1.setBackground(Color.white);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBackground(Color.white);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(35)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
					.addGap(85)
					.addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
					.addGap(36))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
	}
	
	private boolean validar(String idDocente, String linea ,String tema){
		boolean flag = false;
		
		if(validarID(idDocente) && validarNombre(linea) && validarCarnet(tema)){
			flag = true;
		}
		
		return flag;
	}
	
	private boolean validarID(String idDocente){
		boolean flag = idDocente.trim().length() > 0;
		
		if(!flag){
			lblIdDocente.setForeground(Color.RED);
		}
		
		return flag;
	}
	
	private boolean validarNombre(String linea){
		boolean flag = linea.trim().length() > 0;
		
		if(!flag){
			lblLinea.setForeground(Color.RED);
		}
		
		return flag;
	}
	
	private boolean validarCarnet(String tema){
		boolean flag = tema.trim().length() > 0;
			
		if(!flag){
			lblTema.setForeground(Color.RED);
		}
		
		return flag;
	}
	
	
}
