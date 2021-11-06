package patronesDisenio.factoryMethod.botones;

public abstract class Dialog {

	public void abrirDialog() {
		Boton boton = createBoton();
		System.out.println("Abre dialog");
		boton.mostrar();
	}
	
	public abstract Boton createBoton();
}
