package patronesDisenio.abstractFactory;

public class VictorianSofa implements Sofa{

	@Override
	public void sitOn(String person) {
		System.out.println(person + " is sitting on a victorian sofa");
		
	}

}
