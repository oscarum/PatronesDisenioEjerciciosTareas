package patronesDisenio.abstractFactory.elementosGraficos;

public class ComponentFactoryMac implements ComponentFactory{

	@Override
	public Boton createButton() {
		// TODO Auto-generated method stub
		return new BotonMac();
	}

	@Override
	public Checkbox createCheck() {
		// TODO Auto-generated method stub
		return new CheckboxMac();
	}

	@Override
	public ListBox createList() {
		// TODO Auto-generated method stub
		return new ListBoxMac();
	}

	@Override
	public Input createInput() {
		// TODO Auto-generated method stub
		return new InputMac();
	}

}
