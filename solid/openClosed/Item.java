package solid.openClosed;

public class Item {
	private int id;
	private double price;
	private int quantity;
	private double weight;
	
	
	
	public Item(int id, double price, int quantity, double weight) {
		
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	

}
