package solid.openClosed;
import java.util.ArrayList;

public class Order {
	private ArrayList<Item> lista = new ArrayList<>();
	private String ciudad;
	private Shipping shipping;// air, sea ground 
	
	public Order(String ciudad, Shipping shipping) {
		this.ciudad = ciudad;
		this.shipping = shipping;
	}
	
	public double getTotalWeight() {
		double weight = 0;

        for (Item item: lista) {
            weight += item.getWeight();
        }

        return weight;
	}
	
	public double getShippingCost() {
		return shipping.getCost(this);
	}
	
	public double getTotal() {
		double total = 0.0;
		
		for(Item item : lista) {
			total += item.getPrice() + item.getQuantity();
		}
		
		total += total + getImpuestos();
		
		return total;
	}
	
	public double getImpuestos() {
		if (ciudad == "MX") {
            return 0.16;
        }
        else if (ciudad == "US") {
            return 0.07;
        }
        else if (ciudad == "EU") {
            return 0.20;
        }
        else {
            return 0;
        }
	}
	
	public void agregarArticulo(Item articulo) {
		this.lista.add(articulo);
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public Shipping getShipping() {
		return shipping;
	}
	
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	
	
}
