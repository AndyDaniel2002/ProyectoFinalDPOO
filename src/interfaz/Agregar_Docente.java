package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import net.miginfocom.swing.MigLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agregar_Docente extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3792730469501633312L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JTextField textFieldCarnet;
	private JTextField textFieldID;
	/**
	 * @wbp.nonvisual location=362,149
	 */
	private ButtonGroup buttonGroup = new ButtonGroup();
	private ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblNombre;
	private JLabel lblCarnet;
	private JLabel lblIdDocente;
	private JLabel lblCC;
	private JRadioButton rdbtn1;
	private JRadioButton rdbtn2;
	private JRadioButton rdbtn3;
	private JRadioButton rdbtn4;
	private JRadioButton rdbtn5;
	private JRadioButton rdbtn6;
	private JLabel lblCD;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Agregar_Docente dialog = new Agregar_Docente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the dialog.
	 */
	public Agregar_Docente() {
		setTitle("Agregar Docente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 414, 163);
			contentPanel.add(panel);
			panel.setLayout(new MigLayout("", "[111px][109px][3px][109px]", "[20px][20px][20px][23px][23px][23px]"));
			{
				lblNombre = new JLabel("Nombre");
				panel.add(lblNombre, "cell 0 0,growx,aligny center");
			}
			{
				lblCarnet = new JLabel("Carnet");
				panel.add(lblCarnet, "cell 0 1,growx,aligny center");
			}
			{
				lblIdDocente = new JLabel("ID Docente");
				panel.add(lblIdDocente, "cell 0 2,growx,aligny center");
			}
			{
				lblCD = new JLabel("Categor\u00EDa Docente");
				panel.add(lblCD, "cell 0 3,growx,aligny center");
			}
			{
				lblCC = new JLabel("Categor\u00EDa Cient\u00EDfica");
				panel.add(lblCC, "cell 0 5,growx,aligny center");
			}
			{
				textFieldNombre = new JTextField();
				panel.add(textFieldNombre, "cell 1 0 3 1,growx,aligny top");
				textFieldNombre.setColumns(10);
			}
			{
				textFieldCarnet = new JTextField();
				panel.add(textFieldCarnet, "cell 1 1 3 1,growx,aligny top");
				textFieldCarnet.setColumns(10);
			}
			{
				textFieldID = new JTextField();
				panel.add(textFieldID, "cell 1 2 3 1,growx,aligny top");
				textFieldID.setColumns(10);
			}
			
			rdbtn1 = new JRadioButton("Instructor");
			panel.add(rdbtn1, "cell 1 3,growx,aligny top");
			
			rdbtn2 = new JRadioButton("Asistente");
			panel.add(rdbtn2, "cell 3 3,growx,aligny top");
			
			rdbtn3 = new JRadioButton("Auxiliar");
			panel.add(rdbtn3, "cell 1 4,growx,aligny top");
			
			rdbtn4 = new JRadioButton("Titular");
			panel.add(rdbtn4, "cell 3 4,growx,aligny top");
			
			rdbtn5 = new JRadioButton("Master");
			panel.add(rdbtn5, "cell 1 5,growx,aligny top");
			
			rdbtn6 = new JRadioButton("Doctor");
			panel.add(rdbtn6, "cell 3 5,growx,aligny top");
			
			buttonGroup.add(rdbtn1);
			buttonGroup.add(rdbtn2);
			buttonGroup.add(rdbtn3);
			buttonGroup.add(rdbtn4);
			
			buttonGroup_1.add(rdbtn5);
			buttonGroup_1.add(rdbtn6);
		}
		
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBackground(Color.white);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre = textFieldNombre.getText();
				String carnet = textFieldCarnet.getText();
				String idDocente = textFieldID.getText();
				
				boolean isValid = validar(nombre,carnet,idDocente);
				
				if(isValid ){
					if(rdbtn1.isSelected() || rdbtn2.isSelected() || rdbtn3.isSelected() || rdbtn4.isSelected()){
						if( rdbtn5.isSelected() || rdbtn6.isSelected()){
							JOptionPane.showConfirmDialog(null, "Se agregó el docente con exito",null, -1);
							dispose();
						}else{
							lblCC.setForeground(Color.RED);
						}
					}else{
						lblCD.setForeground(Color.RED);
					}
				}
				
			}
		});
		btnNewButton.setBounds(57, 197, 115, 34);
		contentPanel.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBackground(Color.white);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancel.setBounds(251, 197, 115, 34);
		contentPanel.add(btnCancel);
	}
	
	private boolean validar(String name, String carnet, String idDocente){
		boolean flag = false;
		
		if(validarNombre(name) && validarCarnet(carnet) && validarID(idDocente)){
			flag = true;
		}
		
		return flag;
	}
	
	private boolean validarNombre(String name){
		boolean flag = name.trim().length() > 0;
		
		if(!flag){
			lblNombre.setForeground(Color.RED);
		}
		
		return flag;
	}
	
	private boolean validarCarnet(String carnet){
		boolean flag = carnet.trim().length() > 0;
			
		if(!flag){
			lblCarnet.setForeground(Color.RED);
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
	
	
}
