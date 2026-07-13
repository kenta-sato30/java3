package curriculum.j;

public class FullTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1250;
	private static final int STANDARD_HOURS = 8;
	private static final double OVERTIME_MULTIPLIER = 1.25;

	public FullTimeEmployee(String id , String name) {
		super(id, name);
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		if (hoursWorked <= STANDARD_HOURS) {
			return hoursWorked * HOURLY_RATE;
		}
		int pay = STANDARD_HOURS * HOURLY_RATE;
		int overHours = hoursWorked - STANDARD_HOURS;
		int overPay = (int)(overHours * HOURLY_RATE * OVERTIME_MULTIPLIER);
		return pay + overPay;
	}
}
