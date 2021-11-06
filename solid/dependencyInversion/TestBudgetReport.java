package solid.dependencyInversion;

public class TestBudgetReport
{
    public static void main(String[] args) {
        BudgetReport budgetReport = new BudgetReport(new MySQLDatabase());
        budgetReport.save();
        
        BudgetReport budgetReport2 = new BudgetReport(new OracleDataBase());
        budgetReport2.save();
    }
}
