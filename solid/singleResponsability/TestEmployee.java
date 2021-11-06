package solid.singleResponsability;

public class TestEmployee {

	public static void main(String[] args) {
		
		TimeSheetReport timeSheetReport = new TimeSheetReport();
		timeSheetReport.printTimeSheetReport(new Employee("Oscar Urbina"));
	}

}
