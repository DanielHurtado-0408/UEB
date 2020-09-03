package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import utils.RoundedBorder;
import utils.TextPrompt;

public class PanelPrincipal extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel titulo;
	public JLabel[][] tabla;
	private JComboBox<String> asignaturas;
	private JButton btnAgregarAsignatura;
	private JButton btnDetallesAsignatura;
	private JButton btnBorrarAsignatura;
	private JButton btnGuardar;
	private int filas = 8;
	private int columnas = 7;
	private JLabel creditos;

	
	public  PanelPrincipal() {		
	setLayout(null);
	inicializarComponentes();
	setVisible(true);//esto es obligatorio
	nombreColumnas();
	horas();
	
	}
	
	public void inicializarComponentes() {
		this.setOpaque(false);
		setBorder( new CompoundBorder( new EmptyBorder( 40, 40, 40, 40 ), new TitledBorder("") ) );

		
		titulo = new JLabel("Universidad El Bosque - HORARIO");
		titulo.setForeground(Color.WHITE);// darle color a la etiqueta
		titulo.setBounds(190,80,1000,100);
		titulo.setFont(new java.awt.Font("Arial Rounded MT Bold",1,50));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(titulo); 
		
		creditos = new JLabel();
		creditos.setBounds(980,500,300,50);
		creditos.setForeground(Color.white);
		creditos.setFont(new java.awt.Font("Arial Rounded MT Bold",1,50));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(creditos);

		tabla = new JLabel[filas][columnas];
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				tabla[i][j] = new JLabel();
				tabla[i][j].setBackground(Color.white);
				tabla[i][j].setOpaque(true);
				tabla[i][j].setHorizontalAlignment(SwingConstants.CENTER);
			    LineBorder borde = new LineBorder(Color.black);
			    tabla[i][j].setBorder(borde);
			    tabla[i][j].setBounds((j+1)*150,(i+8)*20,150,20);
			    add(tabla[i][j]) ;

			}
		}
		
         
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
	
	public void nombreColumnas() {
		tabla[0][0].setText("Lunes");
		tabla[0][1].setText("Martes");
		tabla[0][2].setText("Miercoles");
		tabla[0][3].setText("Jueves");
		tabla[0][4].setText("Viernes");
		tabla[0][5].setText("Sabado");
		tabla[0][6].setText("Hora");
	}
	
	public void horas() {
		tabla[1][6].setText("7:00-9:00");
		tabla[2][6].setText("9:00-11:00");
		tabla[3][6].setText("11:00-13:00");
		tabla[4][6].setText("14:00-16:00");
		tabla[5][6].setText("16:00-18:00");
		tabla[6][6].setText("18:00-20:00");
		tabla[7][6].setText("20:00-22:00");
	}
	
	
	public JLabel getCreditos() {
		return creditos;
	}

	public void setCreditos(JLabel creditos) {
		this.creditos = creditos;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}


	public JLabel[][] getTabla() {
		return tabla;
	}

	public void setTabla(JLabel[][] tabla) {
		this.tabla = tabla;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
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
