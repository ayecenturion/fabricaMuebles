package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {

	//TODO A completar
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.setModelo(modelo);
		this.setCostoBase(costoBase);
		this.setPorcentajeGanancia(porcentajeGanancia);
	}
	

	//TODO A completar Métodos
	
	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	private void setPorcentajeGanancia(float porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public void setCostoBase(float costoBase) {
		this.costoBase = costoBase;
	}



	public abstract float calcularPrecioVenta() ;

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}

}
