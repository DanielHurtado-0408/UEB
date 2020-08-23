package co.edu.unbosque.Model.Persistence;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{

	private String nombre;
	private String correo;
	private String contrase�a;
	
	public UsuarioDTO(String nombre, String correo, String contrase�a) {
		
		this.nombre = nombre;
		this.correo = correo;
		this.contrase�a = contrase�a;
		
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	@Override
	public String toString() {
		return "nombre: " + nombre + " correo: " + correo + " Contrase�a: " + contrase�a; 
	}

}
