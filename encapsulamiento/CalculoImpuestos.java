package encapsulamiento;

public class CalculoImpuestos {
	
	public static double getImpuestos(String ciudad) {
		double impuestos = 0.0;
		if(ciudad == "MX") {
			impuestos = 0.16;
		} else if (ciudad == "US") {
			impuestos = 0.87;
		} else if (ciudad == "EU") {
			impuestos = 0.21;
		} else if (ciudad == "JP") {
			impuestos = 0.18;
		} else {
			impuestos = 0.0;
		}
		return impuestos;
	}

}
