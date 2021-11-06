package solid.singleResponsability;

public class TimeSheetReport {
	
	
	
	public void printTimeSheetReport(Employee emp) {
		System.out.println("Time sheet of " + emp.getName());
		System.out.println("hours worked:...");
		System.out.println("Holidays:...");
		System.out.println("Days off:...");
	}
}
