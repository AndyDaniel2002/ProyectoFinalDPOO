package interfaz;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;

public class Resultados extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3377253332107884698L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Resultados dialog = new Resultados();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Resultados() {
		setTitle("Agregar Resultados del Investigador");
		setBounds(100, 100, 360, 713);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		setLocationRelativeTo(null);
		
		final JPanel panel = new JPanel();
		panel.setVisible(isOpaque());
		panel.setBounds(10, 31, 314, 164);
		contentPanel.add(panel);
		panel.setLayout(new MigLayout("", "[105px][177px]", "[20px][20px][20px][20px][20px][20px]"));
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		panel.add(lblTtulo, "cell 0 0,growx,aligny center");
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero");
		panel.add(lblNewLabel, "cell 0 1,growx,aligny center");
		
		JLabel lblVolmen = new JLabel("Volumen");
		panel.add(lblVolmen, "cell 0 2,growx,aligny center");
		
		JLabel lblAoDePublicacin = new JLabel("A\u00F1o de publicaci\u00F3n");
		panel.add(lblAoDePublicacin, "cell 0 3,growx,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("P\u00E1ginas");
		panel.add(lblNewLabel_1, "cell 0 4,growx,aligny center");
		
		JSpinner spinner = new JSpinner();
		spinner.setEnabled(false);
		spinner.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		panel.add(spinner, "cell 1 4,growx,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("Grupo de Impacto");
		panel.add(lblNewLabel_2, "cell 0 5,growx,aligny center");
		
		textField = new JTextField();
		textField.setEnabled(false);
		panel.add(textField, "cell 1 0,growx,aligny top");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		panel.add(textField_1, "cell 1 1,growx,aligny top");
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		panel.add(textField_2, "cell 1 2,growx,aligny top");
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		panel.add(textField_3, "cell 1 3,growx,aligny top");
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		panel.add(textField_5, "cell 1 5,growx,aligny top");
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Agregar Art\u00EDculo");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				boolean flag = false;
				if(chckbxNewCheckBox.isSelected() == true){
					flag = true;
				}
				enableComponents(panel, flag);
			}
		});
		chckbxNewCheckBox.setBounds(10, 1, 127, 23);
		contentPanel.add(chckbxNewCheckBox);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 415, 314, 209);
		contentPanel.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[105px][179px]", "[20px][20px][20px][20px][20px][20px][20px][20px]"));
		
		JLabel lblNewLabel_3 = new JLabel("T\u00EDtulo del Cap\u00EDtulo");
		panel_1.add(lblNewLabel_3, "cell 0 0,grow");
		
		JLabel lblNewLabel_4 = new JLabel("Cap\u00EDtulos");
		panel_1.add(lblNewLabel_4, "cell 0 1,grow");
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setEnabled(false);
		spinner_1.setModel(new SpinnerNumberModel(2000, 1960, 2022, 0));
		panel_1.add(spinner_1, "cell 1 1,growx,aligny top");
		
		JLabel lblNewLabel_5 = new JLabel("Autor(es)");
		panel_1.add(lblNewLabel_5, "cell 0 2,grow");
		
		JLabel lblNewLabel_6 = new JLabel("Editores");
		panel_1.add(lblNewLabel_6, "cell 0 3,grow");
		
		JLabel lblEditorial = new JLabel("Editorial");
		panel_1.add(lblEditorial, "cell 0 4,grow");
		
		JLabel lblNewLabel_7 = new JLabel("Cod\u00EDgo ISSN");
		panel_1.add(lblNewLabel_7, "cell 0 5,grow");
		
		JLabel lblNewLabel_8 = new JLabel("Nombre del Libro");
		panel_1.add(lblNewLabel_8, "cell 0 6,grow");
		
		JLabel lblVolumenl = new JLabel("Volumen");
		panel_1.add(lblVolumenl, "cell 0 7,grow");
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		panel_1.add(textField_6, "cell 1 0,growx,aligny top");
		textField_6.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		panel_1.add(textField_8, "cell 1 2,growx,aligny top");
		
		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setColumns(10);
		panel_1.add(textField_9, "cell 1 3,growx,aligny top");
		
		textField_10 = new JTextField();
		textField_10.setEnabled(false);
		textField_10.setColumns(10);
		panel_1.add(textField_10, "cell 1 4,growx,aligny top");
		
		textField_11 = new JTextField();
		textField_11.setEnabled(false);
		textField_11.setColumns(10);
		panel_1.add(textField_11, "cell 1 5,growx,aligny top");
		
		textField_12 = new JTextField();
		textField_12.setEnabled(false);
		textField_12.setColumns(10);
		panel_1.add(textField_12, "cell 1 6,growx,aligny top");
		
		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		panel_1.add(textField_13, "cell 1 7,growx,aligny top");
		
		final JCheckBox chckbxAgregarLibro = new JCheckBox("Agregar Libro");
		chckbxAgregarLibro.setBackground(Color.WHITE);
		chckbxAgregarLibro.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				boolean flag = false;
				if(chckbxAgregarLibro.isSelected() == true){
					flag = true;
				}
				enableComponents(panel_1 , flag);

			}
		});
		chckbxAgregarLibro.setBounds(10, 385, 127, 23);
		contentPanel.add(chckbxAgregarLibro);
		
		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 242, 314, 117);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setBounds(10, 11, 101, 14);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("A\u00F1o");
		lblNewLabel_10.setBounds(10, 36, 101, 14);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Lugar");
		lblNewLabel_11.setBounds(10, 61, 101, 14);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(10, 90, 101, 14);
		panel_2.add(lblIsbn);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setBounds(121, 8, 171, 20);
		panel_2.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		textField_15.setBounds(121, 33, 171, 20);
		panel_2.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		textField_16.setBounds(121, 61, 171, 20);
		panel_2.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		textField_17.setBounds(121, 87, 171, 20);
		panel_2.add(textField_17);
		
		final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Agregar Ponencia");
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				boolean flag = false;
				if(chckbxNewCheckBox_1.isSelected() == true){
					flag = true;
				}
				enableComponents(panel_2, flag);

			}
		});
		chckbxNewCheckBox_1.setBounds(6, 212, 141, 23);
		contentPanel.add(chckbxNewCheckBox_1);
		
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showConfirmDialog(null, "Se agregaron los resultados con exito",null, -1);
				dispose();
			}
		});
		btnNewButton.setBounds(20, 635, 141, 28);
		contentPanel.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(171, 635, 141, 28);
		contentPanel.add(btnCancelar);
	}
	
	public void enableComponents(Container container , boolean b ){
		Component[] components = container.getComponents();
		if(b == false){
			for (Component component : components) {
				component.setEnabled(false);
			}
		}else{
			for (Component component : components) {
				component.setEnabled(true);
			}
		}
	}
}
