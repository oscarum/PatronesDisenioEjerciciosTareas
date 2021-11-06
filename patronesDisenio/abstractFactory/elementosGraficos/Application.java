package patronesDisenio.abstractFactory.elementosGraficos;

import java.util.ArrayList;
import java.util.Scanner;


public class Application {
	private ComponentFactory factory;
    private Boton boton;
    private Checkbox check;
    private ListBox list;
    private Input input;

    public void createForm() {
        boton = factory.createButton();
        check = factory.createCheck();
        list = factory.createList();
        input = factory.createInput();
    }
	
    public void initialize(String sistema) throws Exception {
        if (sistema.equals("win")) {
        	factory = new ComponentFactoryWin();
        }
        else if (sistema.equals("mac")) {
            factory = new ComponentFactoryMac();
        }
        else {
            throw new Exception("Unknown furniture set.");
        }
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que SO prefieres (win/mac): ");
        String sistema = scanner.next();

        Application application = new Application();

        try
        {
            application.main(sistema);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
	}
	
	public void main(String sistema) throws Exception {
        this.initialize(sistema);
        createForm();
        boton.click();
        check.seleccionar();
        list.desplegar();
        input.write();
    }

}
