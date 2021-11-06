package encapsulamiento;

public class EjemploOrden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Articulo art1 = new Articulo(1,10.0,2);
		Articulo art2 = new Articulo(2,15.0,1);
		
		Orden orden = new Orden("MX");
		
		orden.agregarArticulo(art1);
		orden.agregarArticulo(art2);
		System.out.println("El total en MX es: " + orden.getTotal());
		orden.setCiudad("EU");
		System.out.println("El total en EU es: " + orden.getTotal());
		orden.setCiudad("US");
		System.out.println("El total en US es: " + orden.getTotal());
		orden.setCiudad("JP");
		System.out.println("El total en JP es: " + orden.getTotal());
		
	}

}
