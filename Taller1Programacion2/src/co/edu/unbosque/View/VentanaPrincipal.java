package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controller;



public class VentanaPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private PanelPrincipal panelTitulo;
	private PanelFondo jContentPane = null;
	private PanelAgregarAsignatura panelAgregarAsignatura;
	
	public VentanaPrincipal(Controller controller) {
		
		// Definici�n de los par�metros b�sicos de la ventana principal

		setSize(1350, 550); // tama�o en ancho y alto en pixeles
		setResizable(false); // Se puede cambiar el tama�o de la ventana?
		setTitle("MyApp"); // t�tulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// qu� debe hacer si cierra la
												// ventana

		getContentPane().setLayout(null);
		inicializarComponentes();
		setVisible(true);
		setLocationRelativeTo(null); // coloca la ventana al centro de la
		// pantalla
	}
	private void inicializarComponentes() {

		this.setContentPane(getJContentPane());
				
		panelTitulo = new PanelPrincipal();
		panelTitulo.setBounds(20, 20, 450, 450);
		add(panelTitulo);
		
		panelAgregarAsignatura = new PanelAgregarAsignatura();
		panelAgregarAsignatura.setBounds(500,150,350,350);
		
	}
	
	private PanelFondo getJContentPane() {
		if(jContentPane == null) {
			jContentPane = new PanelFondo();
			jContentPane.setLayout(new GridLayout());
		}
		return (PanelFondo) jContentPane;
	}
	
	
	public PanelPrincipal getPanelTitulo() {
		return panelTitulo;
	}
	public void setPanelTitulo(PanelPrincipal panelTitulo) {
		this.panelTitulo = panelTitulo;
	}
	public PanelAgregarAsignatura getPanelAgregarAsignatura() {
		return panelAgregarAsignatura;
	}
	public void setPanelAgregarAsignatura(PanelAgregarAsignatura panelAgregarAsignatura) {
		this.panelAgregarAsignatura = panelAgregarAsignatura;
	}
	
	
	
}