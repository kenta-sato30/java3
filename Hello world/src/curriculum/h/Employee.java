package curriculum.h;

public abstract class Employee {
	
	private String employeeld;

	private String name;
	
	public Employee(String id , String name) {
		this.employeeld = id;
		this.name = name;
	}
	
	public String getEmployeeld() {
		return employeeld;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract int calculateDailyWage(int hoursWorked);
	

}
