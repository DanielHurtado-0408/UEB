package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controller;



public class VentanaPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private PanelPrincipal panelPrincipal;
	private PanelFondo jContentPane = null;
	private PanelAgregarAsignatura panelAgregarAsignatura;
	
	public VentanaPrincipal(Controller controller) {
		
		// Definición de los parámetros básicos de la ventana principal

		setSize(1350, 550); // tamaño en ancho y alto en pixeles
		setResizable(false); // Se puede cambiar el tamaño de la ventana?
		setTitle("MyApp"); // tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// qué debe hacer si cierra la
												// ventana

		getContentPane().setLayout(null);
		inicializarComponentes();
		setVisible(true);
		setLocationRelativeTo(null); // coloca la ventana al centro de la
		// pantalla
	}
	private void inicializarComponentes() {

		this.setContentPane(getJContentPane());

				
		panelPrincipal = new PanelPrincipal();
		panelPrincipal.setBounds(20, 20, 450, 450);
		add(panelPrincipal);
		
		panelAgregarAsignatura = new PanelAgregarAsignatura();
		panelAgregarAsignatura.setBounds(500,150,350,250);
		
	}
	
	private PanelFondo getJContentPane() {
		if(jContentPane == null) {
			jContentPane = new PanelFondo();
			jContentPane.setLayout(new GridLayout());
		}
		return (PanelFondo) jContentPane;
	}
	
	
	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}
	public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	public PanelAgregarAsignatura getPanelAgregarAsignatura() {
		return panelAgregarAsignatura;
	}
	public void setPanelAgregarAsignatura(PanelAgregarAsignatura panelAgregarAsignatura) {
		this.panelAgregarAsignatura = panelAgregarAsignatura;
	}
	
	
	
	
	
}