package solid.liskov;

public class WritableDocument extends Document{

	public WritableDocument(String fileName) {
		super(fileName);
		
	}

	
	public void save() {
		System.out.println(super.getData() + " was saved in " + super.getFileName());
		//System.out.println("SAve writable document");
	}

	@Override
	public void open() {
		System.out.println("Open Writable Document");
		//super.open();
	}
	

}
