package curriculum.i;

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id , String name) {
		super(id, name);
	}
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int houryRate = 1250;
		int overtime = Math.max(0,hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return(regularHours * houryRate) + (int)(overtime * houryRate * 1.25);
	}
}
