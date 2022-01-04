package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private float alto;
	private MaterialSilla material;
	
	public Silla(String modelo, float costoBase, float porcentajeGanancia, float alto, MaterialSilla material) {
		super(modelo, costoBase, porcentajeGanancia);
		this.setAlto(alto);
		this.setMaterial(material);
	}

	public float getAlto() {
		return alto;
	}

	private void setAlto(float alto) {
		this.alto = alto;
	}

	public MaterialSilla getMaterial() {
		return material;
	}

	private void setMaterial(MaterialSilla material) {
		this.material = material;
	}

	@Override
	public void mostrar() {
		System.out.println("Mueble tipo: Silla - Modelo: " + super.getModelo() + ", precio de venta: " + calcularPrecioVenta());
		
	}

	@Override
	public float calcularPrecioVenta() {
		float precio = 0;
	
		precio = super.getCostoBase() + (this.material.getMultiplicadorValor() * this.alto);
		
		return precio;
	}
	

}
