package solid.dependencyInversion;

public interface DataBase {
	
	public void connect(String database);

    public void insert(Entity entity);

    public void update(Entity entity);

    public void delete(Entity entity);

    public void disconnect();
}
