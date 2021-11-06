package patronesDisenio.factoryMethod.botones;

import java.util.Scanner;

public class Ejemplo {

	private static Dialog dialog;
	public static void main(String[] args) {
		leerBandera();
		//asignarBandera("mac");
		if(dialog != null) {
			dialog.abrirDialog();
		} else {
			System.out.println("No se identifico el SO");
		}
	}

	public static void leerBandera() {
		Scanner scan = new Scanner(System.in);
		System.out.print("En que sistema operativo estoy corriendo?: " );
		String band = scan.nextLine();
		asignarBandera(band);
	}
	
	public static void asignarBandera(String b) {
		if(b.equals("win")) {
			dialog = new DialogWin();
		} else if (b.equals("mac")) {
			dialog = new DialogMac();
		} else if (b.equals("lin")) {
			dialog = new DialogLin();
		}
	}
}
