package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	private String nombre;
	private ArrayList<Mueble> mueblesFabricados;

	
	public FabricaDeMuebles(String nombre) {
		this.nombre = nombre;
		this.mueblesFabricados = new ArrayList<>();
	}

	public boolean fabricar(Mueble m) {

		boolean retorno = false;
		
		if(m != null) {
			this.mueblesFabricados.add(m);
			retorno = true;
			System.out.println("Fabricando el mueble: ");
			m.mostrar();
		}
		
		return retorno;
	}

	@Override
	public void mostrar() {
		
		System.out.println("Fábrica de muebles: " + this.nombre);
		System.out.println("Se han fabricado: ");
		mostrarFabricacion();
		System.out.println("La venta total fue: $ " + this.precioTotal());
		//System.out.printf("La venta total fue: $%.2f\n", ventasTotales);
		
	}

	public boolean seHaFabricado(String modelo) {
		int i = 0;
		boolean seHaFabricado = false;
		
		while(i<this.mueblesFabricados.size() && !seHaFabricado) {
			if(this.mueblesFabricados.get(i).modeloCorrecto(modelo)) {
				seHaFabricado = true;
			}else {
				i++;
			}
		}
		
		return seHaFabricado;
	}
	
	private void mostrarFabricacion() {
		int i=0, j=0, k=0;
		for(Mueble m : this.mueblesFabricados) {
			if(m instanceof Mesa) {
				i++;
			}else if(m instanceof Silla) {
				j++;
			}else {
				k++;
			}
		}
		System.out.println(i + " Mesas");
		System.out.println(j + " Sillas");
		System.out.println(k + " Sillones");
	}
	
	private float precioTotal() {
		float total = 0;
		for(Mueble m : this.mueblesFabricados) {
			total = total + m.calcularPrecioVenta();
		}
		
		return total;
	}
}
