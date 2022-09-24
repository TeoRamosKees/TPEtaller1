package modelo;

import java.sql.Date;

public class Pedido {

	private Producto producto;
	private int cantidad;
	private Date fecha;
	
	public Pedido(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public Date getFecha() {
		return fecha;
	}
	
	
}
