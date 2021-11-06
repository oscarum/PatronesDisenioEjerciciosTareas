package patronesDisenio.factoryMethod;

public abstract class Logistics
{
    public void planDelivery() {
        Transport transport = createTransport();//new Truck(); 
        System.out.println("Setting the plan.");
        transport.deliver();
    }
	//public abstract void planDelivary();
    
    public abstract Transport createTransport();
}
