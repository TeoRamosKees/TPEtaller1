package modelo;

import java.sql.Date;

import enums.Estados;

public class Mozo {

	private String nombre;
	private String apellido; 
	private Date fechaNacimiento;
	private int hijosACargo;
	private Enum<Estados> estado;
	
	public Mozo(String nombre, String apellido, Date fechaNacimiento, int hijosACargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.hijosACargo = hijosACargo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int getHijosACargo() {
		return hijosACargo;
	}

	public Enum<Estados> getEstado() {
		return estado;
	}
	
	
}
