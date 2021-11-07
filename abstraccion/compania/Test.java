package abstraccion.compania;

public class Test {

	public static void main(String[] args) {
		Compania compania = new Compania("Softek","Creacion de software/Aplicaciones Web");
		Desarrollador dev = new Desarrollador("Oscar",10000.0,"Desarrollador fullstack");
		Diseniador dis = new Diseniador("Omar",150000.0,"Disenio de UIX");
		Tester test = new Tester("Oswaldo",10400.4,"Tester de funcionalidad");
		compania.contratar(dev);
		compania.contratar(dis);
		compania.contratar(test);
		System.out.println("La compania " + compania.getNombre() + " es contratada para la creacion de un proyecto");
		compania.crearEquipoProyecto();
	}

}
