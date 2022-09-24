package modelo;

import java.util.ArrayList;

import enums.Dias;
import enums.FormaDePago;

public class PromocionTemporal { //deberia ser hija de promocion???

	private String nombre;
	private Enum<FormaDePago> formaPago;
	private int procentajeDescuento;
	private ArrayList<Enum<Dias>> diasPromo;
	private boolean activa;
	private boolean esAcumulable;
	
	public PromocionTemporal(String nombre, Enum<FormaDePago> formaPago, int procentajeDescuento,
			ArrayList<Enum<Dias>> diasPromo, boolean esAcumulable) {
		this.nombre = nombre;
		this.formaPago = formaPago;
		this.procentajeDescuento = procentajeDescuento;
		this.diasPromo = diasPromo;
		this.esAcumulable = esAcumulable;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public String getNombre() {
		return nombre;
	}

	public Enum<FormaDePago> getFormaPago() {
		return formaPago;
	}

	public int getProcentajeDescuento() {
		return procentajeDescuento;
	}

	public ArrayList<Enum<Dias>> getDiasPromo() {
		return diasPromo;
	}

	public boolean isEsAcumulable() {
		return esAcumulable;
	}
	
	
}
