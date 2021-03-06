package co.edu.unbosque.Model.Persistence;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{

	private String nombre;
	private String correo;
	private String contraseña;
	
	public UsuarioDTO(String nombre, String correo, String contraseña) {
		
		this.nombre = nombre;
		this.correo = correo;
		this.contraseña = contraseña;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	@Override
	public String toString() {
		return "nombre: " + nombre + " correo: " + correo + " Contraseña: " + contraseña; 
	}

}
