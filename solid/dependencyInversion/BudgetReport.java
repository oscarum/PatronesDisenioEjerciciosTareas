package solid.dependencyInversion;

public class BudgetReport implements Entity
{
    private DataBase database;

    public BudgetReport(DataBase dataBase)
    {
        this.database = dataBase;
        database.connect("projects");
    }

    public void save() {
        database.insert(this);
    }
}
