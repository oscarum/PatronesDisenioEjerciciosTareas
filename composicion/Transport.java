package composicion;

public class Transport {
	Engine engine;
	Driver driver;
	
	public Transport(Engine engine, Driver driver) {
		this.driver = driver;
		this.engine = engine;
	}
	
	public void deliver(String destination, String cargo) {
		this.driver.navigate();
		this.engine.move();
		System.out.println(cargo + " has been delivered at " + destination);
	}
	
}
