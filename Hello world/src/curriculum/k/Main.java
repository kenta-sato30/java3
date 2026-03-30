package curriculum.k;

import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
			employees.add(new FullTimeEmployee("佐藤", 8));
			employees.add(new ContractEmployee("加藤", 8));
	
	SalaryCalculator calcu = new SalaryCalculator();
	SalaryReporter reporter = new SalaryReporter();
	
	
	for (Employee emp : employees) {
		int salary = calcu.calculate(emp);
		reporter.printReport(emp);
	}
	
	}
	
	
}
