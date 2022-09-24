package modelo;

import java.util.ArrayList;

import enums.Dias;

public class Promocion {

	private int idPromocion;
	private Producto producto;
	private ArrayList<Enum<Dias>> diasPromo;
	private boolean aplicaDosPorUno;
	private boolean aplicaDtoPorCantidad;
	private int dtoPorCantidad_CantMinima;
	private double dtoPorCantidad_PrecioUnitario;
	private boolean activa;
	
	public Promocion(int idPromocion, Producto producto, boolean aplicaDosPorUno, boolean aplicaDtoPorCantidad,
			int dtoPorCantidad_CantMinima, double dtoPorCantidad_PrecioUnitario) {
		this.idPromocion = idPromocion;
		this.producto = producto;
		this.aplicaDosPorUno = aplicaDosPorUno;
		this.aplicaDtoPorCantidad = aplicaDtoPorCantidad;
		this.dtoPorCantidad_CantMinima = dtoPorCantidad_CantMinima;
		this.dtoPorCantidad_PrecioUnitario = dtoPorCantidad_PrecioUnitario;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public int getIdPromocion() {
		return idPromocion;
	}

	public Producto getProducto() {
		return producto;
	}

	public boolean isAplicaDosPorUno() {
		return aplicaDosPorUno;
	}

	public boolean isAplicaDtoPorCantidad() {
		return aplicaDtoPorCantidad;
	}

	public int getDtoPorCantidad_CantMinima() {
		return dtoPorCantidad_CantMinima;
	}

	public double getDtoPorCantidad_PrecioUnitario() {
		return dtoPorCantidad_PrecioUnitario;
	}

	public ArrayList<Enum<Dias>> getDiasPromo() {
		return diasPromo;
	}

	public void setDiasPromo(ArrayList<Enum<Dias>> diasPromo) {
		this.diasPromo = diasPromo;
	}
	
	
	
	
}
