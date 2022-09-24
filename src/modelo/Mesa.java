package modelo;

public class Mesa {

	private int nroMesa;
	private int capacidad;
	private boolean estaOcupada;
	private String estado; //abierta o cerrada
	private int cantidadComensales;
	
	public Mesa(int nroMesa, int capacidad) {
		this.nroMesa = nroMesa;
		this.capacidad = capacidad;
	}

	public boolean isEstaOcupada() {
		return estaOcupada;
	}

	public void setEstaOcupada(boolean estaOcupada) {
		this.estaOcupada = estaOcupada;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCantidadComensales() {
		return cantidadComensales;
	}

	public void setCantidadComensales(int cantidadComensales) {
		this.cantidadComensales = cantidadComensales;
	}

	public int getNroMesa() {
		return nroMesa;
	}

	public int getCapacidad() {
		return capacidad;
	}
	
}
