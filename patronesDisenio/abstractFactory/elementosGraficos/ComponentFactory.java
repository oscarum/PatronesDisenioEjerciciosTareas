package patronesDisenio.abstractFactory.elementosGraficos;

public interface ComponentFactory {
	Boton createButton();
	Checkbox createCheck();
	ListBox createList();
	Input createInput();
}
