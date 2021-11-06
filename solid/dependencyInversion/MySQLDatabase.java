package solid.dependencyInversion;

public class MySQLDatabase implements DataBase
{
    MySQLConnection connection;

    public void connect(String database) {
        connection = new MySQLConnection(database);
    }

    public void insert(Entity entity) {
        System.out.println("Inserting " + entity + " in MySQL using " + connection.getDatabase());
    }

    public void update(Entity entity) {
        System.out.println("Updating " + entity + " in MySQL using " + connection.getDatabase());
    }

    public void delete(Entity entity) {
        System.out.println("Deleting " + entity + " in MySQL using " + connection.getDatabase());
    }

    public void disconnect() {
        connection = null;
    }
}
