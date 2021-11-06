package solid.dependencyInversion;

public class MySQLConnection
{
    private String database;

    public MySQLConnection(String database)
    {
        this.database = database;
    }

    public String getDatabase()
    {
        return database;
    }

    public void setDatabase(String database)
    {
        this.database = database;
    }
}
