package patronesDisenio.factoryMethod;

import java.util.Scanner;

public class Application
{
	private Logistics logistics; 
	
	public void initialize (String logistics) throws Exception{
		if(logistics.equals("road")) {
			this.logistics = new RoadLogistics();
		} else if (logistics.equals("air")) {
			this.logistics = new AirLogistics();
		} else if (logistics.equals("sea")) {
			this.logistics = new SeaLogisticts();
		} else {
			throw new Exception("No se encontro logistics");
		}
	}
	
	public void main(String logisticsType) throws Exception {
        this.initialize(logisticsType);
        logistics.planDelivery();
     
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona el tipo de logistica (road/sea/air): ");
        String logisticsType = scanner.next();

        Application application = new Application();

        try
        {
            application.main(logisticsType);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
