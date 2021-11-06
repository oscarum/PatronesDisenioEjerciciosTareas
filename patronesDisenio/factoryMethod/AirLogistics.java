package patronesDisenio.factoryMethod;

public class AirLogistics extends Logistics {

	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Airplane();
	}

	
	

}
