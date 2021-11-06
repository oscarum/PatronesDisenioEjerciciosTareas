package patronesDisenio.factoryMethod.botones;

public class DialogWin extends Dialog{

	@Override
	public Boton createBoton() {
		
		return new BotonWin();
	}

}
