package patronesDisenio.abstractFactory;

public class ModernSofa implements Sofa{

	@Override
	public void sitOn(String person) {
		
		System.out.println(person + " is sitting on a modern sofa");
	}

}
