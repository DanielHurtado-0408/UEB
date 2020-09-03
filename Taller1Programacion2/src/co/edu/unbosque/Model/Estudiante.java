package co.edu.unbosque.Model;

public class Estudiante {
	
	private double creditos;
	private double valorMatricula;
	
	public Estudiante(double creditos, double valorMatricula) {
		this.creditos = creditos;
		this.valorMatricula = valorMatricula;
	}

	public double getCreditos() {
		return creditos;
	}
	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}
	public double getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	

}
