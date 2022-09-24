package modelo;

public class Operario {

	private String nombre;
	private String apellido; //juntamos nombre y apellido al final?
	private String nombreUsuario; //minimo 10 caracteres
	private String contrasenia; //minimo 12 caracteres
	private boolean activo;
	
	
	public Operario(String nombre, String apellido) { 
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public boolean isActivo() {
		return activo;
	}
	
	
}
