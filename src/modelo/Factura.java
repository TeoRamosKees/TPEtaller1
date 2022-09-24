package modelo;

import java.sql.Date;
import java.util.ArrayList;

import enums.FormaDePago;

public class Factura {

	private Date fecha;
	private Mesa mesa;
	private ArrayList<Pedido> listaPedidos;
	private double total;
	private Enum<FormaDePago> formaPago;
	private ArrayList<Promocion> promocionesAplicada;
	
	public Factura(Date fecha, Mesa mesa, ArrayList<Pedido> listaPedidos, double total, Enum<FormaDePago> formaPago,
			ArrayList<Promocion> promocionesAplicada) {
		this.fecha = fecha;
		this.mesa = mesa;
		this.listaPedidos = listaPedidos;
		this.total = total;
		this.formaPago = formaPago;
		this.promocionesAplicada = promocionesAplicada;
	}

	public Date getFecha() {
		return fecha;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public double getTotal() {
		return total;
	}

	public Enum<FormaDePago> getFormaPago() {
		return formaPago;
	}

	public ArrayList<Promocion> getPromocionesAplicada() {
		return promocionesAplicada;
	}
	
	
}
