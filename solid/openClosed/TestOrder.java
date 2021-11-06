package solid.openClosed;

public class TestOrder {

	public static void main(String[] args) {
		Item airforce1 = new Item(1, 569.90, 2, 150);
        Item airmax = new Item(2, 450.50, 3,150);
        Item laces = new Item(3, 55.90, 1, 0.5);

        Shipping groundShipping = new GroundShipping();
        Shipping airShipping = new AirShipping();
        Order order = new Order("MX", groundShipping);
        order.agregarArticulo(laces);
        System.out.println("Costo de envio en MX compra pequena por tierra: " + order.getShippingCost());

        order.setShipping(airShipping);
        System.out.println("Costo de envio en MX compra pequena por aire: " + order.getShippingCost());

        order.agregarArticulo(airforce1);
        order.agregarArticulo(airmax);
        System.out.println("Costo de envio en MX compra grande por aire: " + order.getShippingCost());

        order.setShipping(groundShipping);
        System.out.println("Costo de envio en MX compra grande por tierra: " + order.getShippingCost());

	}

}
