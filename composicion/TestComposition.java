package composicion;

public class TestComposition {

	public static void main(String[] args) {
		Transport trans = new Transport(new ElectricEngine(), new Robot());
		trans.deliver("CDMX", "sneakers");
		
		Transport trans2 = new Transport(new CombustionEngine(), new Human());
		trans2.deliver("GDL", "guitar");
		
		Transport trans3 = new Transport(new FusionEngine(), new Robot());
		trans3.deliver("SIN", "food");
	}

}
