package ar.edu.unlam.pb2;

public class Cliente {
	private Integer cantidadProductos;
	private Integer posicion;

	public Cliente(Integer cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public int getCantidadDeProductos() {
		return this.cantidadProductos;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	
	public Integer getPosicion() {
		return this.posicion;
	}
	

}
