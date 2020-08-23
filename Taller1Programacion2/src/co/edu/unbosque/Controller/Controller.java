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

import co.edu.unbosque.Model.Mundo;
import co.edu.unbosque.View.View;

public class Controller implements ActionListener, ItemListener{
	
	private View view;
	private Mundo mundo;
	
	public Controller() {
		
		view = new View(this);
		mundo = new Mundo();
		this.setActionListener();
		
	}
	
	public void setActionListener() {
		view.getVentanaPrincipal().getPanelTitulo().getBtnGuardar().addActionListener(this);;
		view.getVentanaPrincipal().getPanelTitulo().getBtnAgregarAsignatura().addActionListener(this);
		view.getVentanaPrincipal().getPanelTitulo().getBtnBorrarAsignatura().addActionListener(this);
		view.getVentanaPrincipal().getPanelTitulo().getBtnDetallesAsignatura().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.getVentanaPrincipal().getPanelTitulo().getBtnAgregarAsignatura()) {
			AgregarAsignatura();
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void AgregarAsignatura() {
		view.getVentanaPrincipal().getPanelAgregarAsignatura().setVisible(true);
		  view.getVentanaPrincipal().getPanelTitulo().setVisible(true);
		  view.getVentanaPrincipal().repaint();
	}

}

