package encapsulamiento;
import java.util.ArrayList;

public class Orden {
	ArrayList<Articulo> lista = new ArrayList<>();
	String ciudad;
	
	public Orden(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public double getTotal() {
		double total = getTotalArticulos();
		total += total * CalculoImpuestos.getImpuestos(this.ciudad);
		return total;
	}
	 
	public double getTotalArticulos() {
		double totalArticulos = 0.0;
		
		for(Articulo art : lista) {
			totalArticulos += art.getPrice() * art.getQuantity();
		}
		
		return totalArticulos;
	}
	
	public double getImpuestos() {
		double impuestos = 0.0;
		if(this.ciudad == "MX") {
			impuestos = 0.16;
		} else if (this.ciudad == "US") {
			impuestos = 0.87;
		} else if (this.ciudad == "EU") {
			impuestos = 0.21;
		} else if (this.ciudad == "JP") {
			impuestos = 0.18;
		} else {
			impuestos = 0.0;
		}
		return impuestos;
	}
	
	public void agregarArticulo(Articulo articulo) {
		this.lista.add(articulo);
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
