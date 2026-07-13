package curriculum.k;

public abstract class Employee implements Payable{
	private String name;
	private int hoursWorked;
	
	public Employee(String name, int hoursWorked) {
		this.name = name;
		this.hoursWorked = hoursWorked;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	@Override
	public abstract int calculateSalary();

}
