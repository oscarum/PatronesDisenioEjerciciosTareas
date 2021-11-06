package patronesDisenio.factoryMethod.botones;

public class DialogMac extends Dialog{

	@Override
	public Boton createBoton() {
		// TODO Auto-generated method stub
		return new BotonMac();
	}

}
