package curriculum.h;

class FullTimeEmployee extends Employee {
	
	private static final int HOURLY_RATE = 1200;
	private static final double OVERTIME_RATE = 1.25;
	
	public FullTimeEmployee(String id , String name) {
		super(id, name);
	}
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		
		if (hoursWorked <= 8) {
			return  hoursWorked * HOURLY_RATE;
		}else {
			int normal = 8 * HOURLY_RATE;
			int over = hoursWorked - 8;
			int over2 = (int)(over * HOURLY_RATE * OVERTIME_RATE);
			return normal + over2;
			
		}
		
	}
}
