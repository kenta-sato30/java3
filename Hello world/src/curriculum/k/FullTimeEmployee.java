package curriculum.k;


public class FullTimeEmployee extends Employee{
	private static final int HOURLY_RATE = 1200;
	
	public FullTimeEmployee(String name , int hoursWorked) {
		super(name, hoursWorked);
	}
	
	@Override
	public int calculateSalary() {
		return getHoursWorked() * HOURLY_RATE;
	}
	

}
