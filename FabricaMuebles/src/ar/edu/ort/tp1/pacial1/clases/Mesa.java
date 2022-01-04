package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private float largo;
	private float ancho;
	private TipoMesa tipoMesa;
	
	public Mesa(String modelo, float costoBase, float porcentajeGanancia, float largo, float ancho, TipoMesa tipoMesa) {
		super(modelo, costoBase, porcentajeGanancia);
		this.setLargo(largo);
		this.setAncho(ancho);
		this.setTipoMesa(tipoMesa);
	}
	
	public double getLargo() {
		return largo;
	}

	private void setLargo(float largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	private void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public TipoMesa getTipoMesa() {
		return tipoMesa;
	}

	private void setTipoMesa(TipoMesa tipoMesa) {
		this.tipoMesa = tipoMesa;
	}

	@Override
	public void mostrar() {
		System.out.println("Mueble tipo: Mesa - Modelo: " + super.getModelo() + ", precio de venta: " + calcularPrecioVenta());
		
	}

	@Override
	public float calcularPrecioVenta() {
		float precio = 0;
		
		precio = (super.getCostoBase() * this.tipoMesa.getMultiplicadorValor()) + (COEFICIENTE_SUPERFICIE * this.largo * this.ancho);
		
		return precio;
	}


}
