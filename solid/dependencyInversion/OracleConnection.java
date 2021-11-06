package solid.dependencyInversion;

public class OracleConnection {
	
	private String database;

    public OracleConnection(String database)
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
