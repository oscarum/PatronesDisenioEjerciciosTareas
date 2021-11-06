package solid.dependencyInversion;

public class OracleDataBase implements DataBase{

	OracleConnection connection;

    public void connect(String database) {
        connection = new OracleConnection(database);
    }

    public void insert(Entity entity) {
        System.out.println("Inserting " + entity + " in Oracle using " + connection.getDatabase());
    }

    public void update(Entity entity) {
        System.out.println("Updating " + entity + " in Oracle using " + connection.getDatabase());
    }

    public void delete(Entity entity) {
        System.out.println("Deleting " + entity + " in Oracle using " + connection.getDatabase());
    }

    public void disconnect() {
        connection = null;
    }
}
