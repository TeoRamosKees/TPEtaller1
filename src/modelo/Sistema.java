package modelo;

import java.util.ArrayList;

public class Sistema {

	private String nombreLocal;
	private ArrayList<Mozo> mozos;
	private ArrayList<Producto> productos;
	private ArrayList<Operario> operarios;
	private ArrayList<Mesa> mesas;
	
	public Sistema(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public String getNombreLocal() {
		return nombreLocal;
	}

	public ArrayList<Mozo> getMozos() {
		return mozos;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public ArrayList<Operario> getOperarios() {
		return operarios;
	}

	public ArrayList<Mesa> getMesas() {
		return mesas;
	}
	
	
	
	
	
}
