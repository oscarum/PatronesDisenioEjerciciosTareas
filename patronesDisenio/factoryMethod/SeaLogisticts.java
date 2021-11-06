package patronesDisenio.factoryMethod;

public class SeaLogisticts extends Logistics {

	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Ship();
	}
	

}
