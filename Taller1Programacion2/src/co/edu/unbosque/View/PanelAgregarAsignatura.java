package co.edu.unbosque.View;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.TextPrompt;

public class PanelAgregarAsignatura extends JDialog{
	private static final long serialVersionUID = 1L;
	private JLabel nmAsignatura;
	private JLabel nmProfesor;
	private JLabel color;
	private JLabel horario;
	private JTextField txtAsignatura;
	private JTextField txtProfesor;
	private JComboBox <String> cbcolor;
	private JComboBox <String> cbhorario;

	
	public PanelAgregarAsignatura() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);//esto es obligatorio
		setResizable(false);
		setTitle("Agregar Asignatura");
	}
	
	public void inicializarComponentes() {
		
		nmAsignatura = new JLabel("Nombre Asignatura:");
		nmAsignatura.setBounds(10,10,100,50);
		nmAsignatura.setFont(new java.awt.Font("Arial",1,10));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(nmAsignatura);
		
		nmProfesor = new JLabel("Nombre Profesor:");
		nmProfesor.setBounds(10,30,100,50);
		nmProfesor.setFont(new java.awt.Font("Arial",1,10));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(nmProfesor);
		
		color = new JLabel("Asignar Color:");
		color.setBounds(10,50,100,50);
		color.setFont(new java.awt.Font("Arial",1,10));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(color);
		
		horario = new JLabel("Horario Asignatura:");
		horario.setBounds(10,70,100,50);
		horario.setFont(new java.awt.Font("Arial",1,10));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(horario);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(180, 30, 150, 20);
		TextPrompt asignaturaPt = new TextPrompt("Asignatura", txtAsignatura);
		asignaturaPt.changeAlpha(0.55f);
		asignaturaPt.changeStyle(Font.ITALIC);
		add(txtAsignatura);
		
		txtProfesor = new JTextField();
		txtProfesor.setBounds(180, 50, 150, 20);
		TextPrompt profesorPt = new TextPrompt("Profesor", txtProfesor);
		profesorPt.changeAlpha(0.55f);
		profesorPt.changeStyle(Font.ITALIC);
		add(txtProfesor);
		
		cbcolor = new JComboBox();
		cbcolor.addItem("Color");
		cbcolor.setBounds(180, 70, 150, 20);
		add(cbcolor);
		
		cbhorario = new JComboBox();
		cbhorario.addItem("7:00-9:00");
		cbhorario.addItem("9:00-11:00");
		cbhorario.addItem("11:00-1:00");
		cbhorario.addItem("2:00-4:00");
		cbhorario.addItem("4:00-6:00");
		cbhorario.addItem("6:00-8:00");
		cbhorario.addItem("8:00-10:00");
		cbhorario.setBounds(180, 90, 150, 20);
		add(cbhorario);
	}

	public JLabel getNmAsignatura() {
		return nmAsignatura;
	}

	public void setNmAsignatura(JLabel nmAsignatura) {
		this.nmAsignatura = nmAsignatura;
	}

	public JLabel getNmProfesor() {
		return nmProfesor;
	}

	public void setNmProfesor(JLabel nmProfesor) {
		this.nmProfesor = nmProfesor;
	}

	public JLabel getColor() {
		return color;
	}

	public void setColor(JLabel color) {
		this.color = color;
	}

	public JLabel getHorario() {
		return horario;
	}

	public void setHorario(JLabel cbhorario) {
		cbhorario = cbhorario;
	}

	public JTextField getTxtAsignatura() {
		return txtAsignatura;
	}

	public void setTxtAsignatura(JTextField txtAsignatura) {
		this.txtAsignatura = txtAsignatura;
	}

	public JTextField getTxtProfesor() {
		return txtProfesor;
	}

	public void setTxtProfesor(JTextField txtProfesor) {
		this.txtProfesor = txtProfesor;
	}

	public JComboBox<String> getCbcolor() {
		return cbcolor;
	}

	public void setCbcolor(JComboBox<String> cbcolor) {
		this.cbcolor = cbcolor;
	}

	public JComboBox<String> getCbhorario() {
		return cbhorario;
	}

	public void setCbhorario(JComboBox<String> cbhorario) {
		this.cbhorario = cbhorario;
	}
	
	

}
