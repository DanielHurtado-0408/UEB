package co.edu.unbosque.Model.Persistence;

import java.io.Serializable;

public class ProductoDTO implements Serializable{

	private String nombre;
	private int precio;
	private String descripcion;
	
	public ProductoDTO(String nombre, int precio, String descripcion) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

}
