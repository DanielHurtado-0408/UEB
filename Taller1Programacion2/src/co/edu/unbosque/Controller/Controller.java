package co.edu.unbosque.Controller;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import co.edu.unbosque.Model.Estudiante;
import co.edu.unbosque.Model.Mundo;
import co.edu.unbosque.View.Mensaje;
import co.edu.unbosque.View.View;

public class Controller implements ActionListener, ItemListener{
	
	private View view;
	private Mensaje pregunta;
	private Estudiante estudiante;
	int creditosOcupados = 0;

	
	public Controller() {
		
		view = new View(this);
		pregunta = new Mensaje();
		estudiante = new Estudiante(0,0);
		this.setActionListener();
		formulario(estudiante.getValorMatricula(),estudiante.getCreditos());

		
	}
	
	public void setActionListener() {
		view.getVentanaPrincipal().getPanelPrincipal().getBtnGuardar().addActionListener(this);;
		view.getVentanaPrincipal().getPanelPrincipal().getBtnAgregarAsignatura().addActionListener(this);
		view.getVentanaPrincipal().getPanelPrincipal().getBtnBorrarAsignatura().addActionListener(this);
		view.getVentanaPrincipal().getPanelPrincipal().getBtnDetallesAsignatura().addActionListener(this);
		view.getVentanaPrincipal().getPanelAgregarAsignatura().getBtnAceptar().addActionListener(this);
		view.getVentanaPrincipal().getPanelAgregarAsignatura().getBtnCancelar().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.getVentanaPrincipal().getPanelPrincipal().getBtnAgregarAsignatura()) {
			AgregarAsignatura();
			
		}
		if(e.getSource() == view.getVentanaPrincipal().getPanelAgregarAsignatura().getBtnCancelar()) {
			view.getVentanaPrincipal().getPanelAgregarAsignatura().setVisible(false);
		}
		if(e.getSource()== view.getVentanaPrincipal().getPanelAgregarAsignatura().getBtnAceptar()) {
			contadorCreditos();
			view.getVentanaPrincipal().getPanelAgregarAsignatura().setVisible(false);
			view.getVentanaPrincipal().getPanelAgregarAsignatura().getCreditos().setText("");
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbcolor()) {
			
		}
		
	}
	
	public void AgregarAsignatura() {
		view.getVentanaPrincipal().getPanelAgregarAsignatura().setVisible(true);
		view.getVentanaPrincipal().getPanelPrincipal().setVisible(true);
		view.getVentanaPrincipal().repaint();
		
		String nombreAsignatura = view.getVentanaPrincipal().getPanelAgregarAsignatura().getTxtAsignatura().getText();
		String profesor = view.getVentanaPrincipal().getPanelAgregarAsignatura().getTxtProfesor().getText();
	}
	
	public void formulario(double valorMatricula, double creditos) {
		String respuesta = pregunta.preguntaSiNo("¿Estudiante Becado?");
		if(respuesta == "SI") {
			String respuesta2 = pregunta.preguntaSiNo("¿Primer semestre?");
			if(respuesta2 == "SI") {
				valorMatricula = 0;
				creditos = 18;
				pregunta.mostrarMensaje("Valor de matricula: "+ valorMatricula + " Limite de creditos: "+ creditos);
			}
			else {
				double ponderado = Double.parseDouble(pregunta.pregunta("Ingrese su ponderado: "));
				if(ponderado >= 3.3) {
					valorMatricula = 0;
					creditos = 18;
					pregunta.mostrarMensaje("Valor de matricula:"+ valorMatricula + " Limite de creditos: "+ creditos);
				}
				else {
					valorMatricula = 320700;
					creditos = 18;
					pregunta.mostrarMensaje("Valor de matricula:"+ valorMatricula + " Limite de creditos: "+ creditos);
				}
			}
		}
		else {
			String respuesta3 = pregunta.preguntaSiNo("¿Primer semestre?");
			if(respuesta3 == "SI") {
				valorMatricula = 6414000;
				creditos = 18;
				pregunta.mostrarMensaje("Valor de matricula: "+ valorMatricula + " Limite de creditos: "+ creditos);
			}
			else {
				double ponderado = Double.parseDouble(pregunta.pregunta("Ingrese su ponderado: "));
				if(ponderado < 3.5) {
					valorMatricula = 6414000;
					creditos = 18;
					pregunta.mostrarMensaje(" Valor de matricula: "+ valorMatricula + " Limite de creditos: "+ creditos);
				}
				if(ponderado>= 3.5 && ponderado<3.7) {
					valorMatricula = 6093300;
					creditos = 18;
					pregunta.mostrarMensaje(" Valor de matricula: "+ valorMatricula + " Limite de creditos: "+ creditos);
				}
				if(ponderado >=3.7 && ponderado<4) {
					valorMatricula = 5131000;
					creditos = 18;
					pregunta.mostrarMensaje(" Valor de matricula: "+ valorMatricula + " Limite de creditos: "+ creditos);
				}
				if(ponderado>= 4 && ponderado<4.5) {
					valorMatricula = 4169100;
					creditos = 25;
					pregunta.mostrarMensaje("Valor de matricula: "+ valorMatricula + " Limite de creditos: "+ creditos);
				}
				if(ponderado>= 4.5 && ponderado<=5) {
					valorMatricula = 3207000;
					creditos = 25;
					pregunta.mostrarMensaje("Valor de matricula: "+ valorMatricula + " Limite de creditos: "+ creditos);
				}
				if(ponderado < 0 || ponderado > 5) {
					pregunta.mostrarMensaje("Valor de ponderado incorrecto");
				}
			}
		}
		estudiante.setValorMatricula(valorMatricula);
   }
	
	public String eleccionColores() {
		String color = "";
		if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbcolor().getSelectedItem().toString() == "Rojo") {
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "7:00-9:00") {
				if() {
					
				}
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "9:00-11:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "11:00-1:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "2:00-4:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "4:00-6:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "6:00-8:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "8:00-10:00") {
				
			}


		}
		if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbcolor().getSelectedItem().toString() == "Verde") {
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "7:00-9:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "9:00-11:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "11:00-1:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "2:00-4:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "4:00-6:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "6:00-8:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "8:00-10:00") {
				
			}		
		}
		if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbcolor().getSelectedItem().toString() == "Azul") {
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "7:00-9:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "9:00-11:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "11:00-1:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "2:00-4:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "4:00-6:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "6:00-8:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "8:00-10:00") {
				
			}
		}
		if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbcolor().getSelectedItem().toString() == "Amarillo") {
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "7:00-9:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "9:00-11:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "11:00-1:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "2:00-4:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "4:00-6:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "6:00-8:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "8:00-10:00") {
				
			}		
		}
		if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbcolor().getSelectedItem().toString() == "Rosado") {
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "7:00-9:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "9:00-11:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "11:00-1:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "2:00-4:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "4:00-6:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "6:00-8:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "8:00-10:00") {
				
			}		
		}
		if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbcolor().getSelectedItem().toString() == "Morado") {
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "7:00-9:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "9:00-11:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "11:00-1:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "2:00-4:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "4:00-6:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "6:00-8:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "8:00-10:00") {
				
			}		
		}
		if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbcolor().getSelectedItem().toString() == "Naranja") {
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "7:00-9:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "9:00-11:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "11:00-1:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "2:00-4:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "4:00-6:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "6:00-8:00") {
				
			}
			if(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCbhorario().getSelectedItem().toString() == "8:00-10:00") {
				
			}		
		}
		return color;
	}
	
	//public 
	
	public void contadorCreditos() {
		
		creditosOcupados  += Integer.parseInt(view.getVentanaPrincipal().getPanelAgregarAsignatura().getCreditos().getText());		
		view.getVentanaPrincipal().getPanelPrincipal().getCreditos().setText("Creditos ocupados: " + creditosOcupados);
	}

}

