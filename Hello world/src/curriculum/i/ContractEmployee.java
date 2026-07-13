package curriculum.i;

class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id,name);
	}
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int houlyRate = 1000;
		return hoursWorked * houlyRate;
	}

}
