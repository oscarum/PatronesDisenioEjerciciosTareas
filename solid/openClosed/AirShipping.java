package solid.openClosed;

public class AirShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		// TODO Auto-generated method stub
		return Double.max(20, order.getTotalWeight() * 3);
	}

}
