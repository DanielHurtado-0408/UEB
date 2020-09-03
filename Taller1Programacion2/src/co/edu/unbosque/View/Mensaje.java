package co.edu.unbosque.View;

import javax.swing.JOptionPane;

public class Mensaje {
	
	public static String preguntaSiNo (String pregunta){
		int aux = JOptionPane.showOptionDialog(
				null,
				pregunta,
				"seleccione una opcion:",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				new Object[] {"SI", "NO"},
				"SI");
		if(aux!=-1) {
			if((aux+1)==1) {
				return "SI";
			}
			else {
				return "NO";
			}
		}
		return null;
	}
	
	public void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(null,mensaje);
	}
	
	public String pregunta(String pregunta) {
		String respuesta = JOptionPane.showInputDialog(null, pregunta);
		return respuesta;
	}

}


