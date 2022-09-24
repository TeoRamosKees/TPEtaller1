package modelo;

import java.sql.Date;
import java.util.ArrayList;

public class Comanda {

	private Date fecha;
	private Mesa mesa;
	private ArrayList<Pedido> productos;
	private boolean estaAbierta;
	private String estado; //tambien abierta o cerrada
	
	public Comanda(Date fecha, Mesa mesa) {
		this.fecha = fecha;
		this.mesa = mesa;
	}

	public boolean isEstaAbierta() {
		return estaAbierta;
	}

	public void setEstaAbierta(boolean estaAbierta) {
		this.estaAbierta = estaAbierta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public ArrayList<Pedido> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Pedido> productos) {
		this.productos = productos;
	}
	
	
	
	
}
