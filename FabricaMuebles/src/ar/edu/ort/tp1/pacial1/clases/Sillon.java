package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {
	
	private int cantCuerpos;
	private TelaSillon tela;

	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantCuerpos, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		this.setCantCuerpos(cantCuerpos);
		this.setTela(tela);
	}
	
	public int getCantCuerpos() {
		return cantCuerpos;
	}

	private void setCantCuerpos(int cantCuerpos) {
		this.cantCuerpos = cantCuerpos;
	}

	public TelaSillon getTela() {
		return tela;
	}

	private void setTela(TelaSillon tela) {
		this.tela = tela;
	}

	@Override
	public void mostrar() {
		System.out.println("Mueble tipo: Sillon - Modelo: " + super.getModelo() + ", precio de venta: " + calcularPrecioVenta());
		
	}

	@Override
	public float calcularPrecioVenta() {
		float precio = 0;

		precio = (super.getCostoBase() * this.cantCuerpos * this.tela.getPorcentaje());
		
		return precio;
	}



}
