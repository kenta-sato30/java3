package curriculum.k;

public class SalaryReporter {
	
	public void printReport(Employee employee) {
		int salary = employee.calculateSalary();
		System.out.println(employee.getName() + "の給与は" + salary + "円です。");
	}

}
