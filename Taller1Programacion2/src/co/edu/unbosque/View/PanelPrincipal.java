package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import utils.RoundedBorder;
import utils.TextPrompt;

public class PanelPrincipal extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel titulo;
	private JTable table;
	private JComboBox<String> asignaturas;
	private JButton btnAgregarAsignatura;
	private JButton btnDetallesAsignatura;
	private JButton btnBorrarAsignatura;
	private JButton btnGuardar;

	
	public  PanelPrincipal() {		
	setLayout(null);
	inicializarComponentes();
	setVisible(true);//esto es obligatorio
	}
	
	public void inicializarComponentes() {
		this.setOpaque(false);
		setBorder( new CompoundBorder( new EmptyBorder( 40, 40, 40, 40 ), new TitledBorder("") ) );

		
		titulo = new JLabel("Universidad El Bosque - HORARIO");
		titulo.setForeground(Color.WHITE);// darle color a la etiqueta
		titulo.setBounds(190,80,1000,100);
		titulo.setFont(new java.awt.Font("Arial Rounded MT Bold",1,50));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(titulo); 

		
		
        String [] nombreColumnas = {"Lunes","Martes", "Miercoles", "Juves", "Viernes", "Sabado" };
        String [] Hora = {"7:00 - 9:00","9:00 - 11:00", "11:00 - 1:00", "2:00 - 4:00", "4:00 - 6:00", "6:00 - 8:00","8:00 - 10:00" };
        String [][] datos ={ {"1", "2", "3", "4","5","6"}
        };
        
		DefaultTableModel modelo = new DefaultTableModel(datos, nombreColumnas);
		table =  new JTable(modelo);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		add(scroll);
        table.setBounds(85, 180, 1165, 115);
        modelo.addColumn("Hora", Hora );
        add(table);
        
        
		asignaturas = new  JComboBox<String>();
		asignaturas.setBounds(85, 330, 250,50);
		asignaturas.setOpaque(false);
		asignaturas.addItem("Asignatura");
		asignaturas.setFont(new java.awt.Font("Calibri light",1,20));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(asignaturas);
		
		
		btnDetallesAsignatura = new JButton("Detalles De Asignatura");
		btnDetallesAsignatura.setBounds(380,330,250,50);
		add(btnDetallesAsignatura);
			
		
		btnAgregarAsignatura = new JButton("Agregar Asignatura");
		btnAgregarAsignatura.setBounds(680,330,250,50);
		add(btnAgregarAsignatura);
		
		btnBorrarAsignatura = new JButton("Borrar Asignatura");
		btnBorrarAsignatura.setBounds(980,330,250,50);
		add(btnBorrarAsignatura);
		
		btnGuardar = new JButton("Guardar Horario E Imprimir Matricula");
		btnGuardar.setBounds(530,400,250,50);
		add(btnGuardar);
			

	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JComboBox<String> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(JComboBox<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public JButton getBtnAgregarAsignatura() {
		return btnAgregarAsignatura;
	}

	public void setBtnAgregarAsignatura(JButton btnAgregarAsignatura) {
		this.btnAgregarAsignatura = btnAgregarAsignatura;
	}

	public JButton getBtnDetallesAsignatura() {
		return btnDetallesAsignatura;
	}

	public void setBtnDetallesAsignatura(JButton btnDetallesAsignatura) {
		this.btnDetallesAsignatura = btnDetallesAsignatura;
	}

	public JButton getBtnBorrarAsignatura() {
		return btnBorrarAsignatura;
	}

	public void setBtnBorrarAsignatura(JButton btnBorrarAsignatura) {
		this.btnBorrarAsignatura = btnBorrarAsignatura;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}
	

	

}
