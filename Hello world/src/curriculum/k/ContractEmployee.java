package curriculum.k;


public class ContractEmployee extends Employee {
	private static final int HOURLY_RATE = 1000;
	
	public ContractEmployee(String name, int hoursWorked) {
		super(name, hoursWorked);
	}

	
	@Override
	public int calculateSalary() {
		return getHoursWorked() * HOURLY_RATE;
	}

}
