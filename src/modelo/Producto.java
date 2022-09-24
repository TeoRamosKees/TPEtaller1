package modelo;

public class Producto {

	private int idProducto;
	private String nombre;
	private double precioCosto;
	private double precioVenta;
	private int stockInicial;
	
	public Producto(int idProducto, String nombre, double precioCosto, double precioVenta, int stockInicial) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precioCosto = precioCosto;
		this.precioVenta = precioVenta;
		this.stockInicial = stockInicial;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public int getStockInicial() {
		return stockInicial;
	}
	
	
	
	
}
