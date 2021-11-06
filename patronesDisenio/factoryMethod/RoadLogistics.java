package patronesDisenio.factoryMethod;

public class RoadLogistics extends Logistics {

	
	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Truck();
	}

	

}
