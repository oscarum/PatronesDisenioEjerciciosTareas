package patronesDisenio.abstractFactory;


import java.util.ArrayList;
import java.util.Scanner;

public class Application
{
    private FurnitureFactory furnitureFactory;
    private Chair chair;
    private Table table;
    private Sofa sofa;

    public void createSet() {
        chair = furnitureFactory.createChair();
        table = furnitureFactory.createTable();
        sofa = furnitureFactory.createSofa();
    }

    public void sitGuests(ArrayList<String> guests) {
        for (String guest: guests) {
            chair.sitOn(guest);
        }
    }

    public void sitGuests2(ArrayList<String> guests) {
        for (String guest: guests) {
            sofa.sitOn(guest);
        }
    }
    
    public void serve() {
        table.putSomethingOn("Coffe");
        table.putSomethingOn("Cookies");
    }

    public void initialize(String furnitureStyle) throws Exception {
        if (furnitureStyle.equals("victorian")) {
            furnitureFactory = new VictorianFurnitureFactory();
        }
        else if (furnitureStyle.equals("modern")) {
            furnitureFactory = new ModernFurnitureFactory();
        }
        else {
            throw new Exception("Unknown furniture set.");
        }
    }

    public void main(String furnitureStyle) throws Exception {
        this.initialize(furnitureStyle);
        createSet();
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Pancho");
        guests.add("Lucy");
        guests.add("Emma");
        guests.add("Pepe");
        sitGuests(guests);
        serve();
        sitGuests2(guests);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que estilo prefieres (victorian/modern): ");
        String furnitureStyle = scanner.next();

        Application application = new Application();

        try
        {
            application.main(furnitureStyle);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
