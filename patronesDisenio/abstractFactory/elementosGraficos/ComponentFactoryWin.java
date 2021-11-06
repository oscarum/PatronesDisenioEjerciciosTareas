package patronesDisenio.abstractFactory.elementosGraficos;

public class ComponentFactoryWin implements ComponentFactory{

	@Override
	public Boton createButton() {
		
		return new BotonWin();
	}

	@Override
	public Checkbox createCheck() {
		// TODO Auto-generated method stub
		return new CheckboxWin();
	}

	@Override
	public ListBox createList() {
		// TODO Auto-generated method stub
		return new ListBoxWin();
	}

	@Override
	public Input createInput() {
		// TODO Auto-generated method stub
		return new InputWin();
	}

}
