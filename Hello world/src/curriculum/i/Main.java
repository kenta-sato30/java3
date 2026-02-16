package curriculum.i;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> list =new ArrayList<>();
		list.add(new FullTimeEmployee("001","佐藤"));
		list.add(new ContractEmployee("002","加藤"));
		
		System.out.println();
		
		for (Employee emp : list) {
			int wage = emp.calculateDailyWage(9);
			String type = (emp instanceof FullTimeEmployee) ? "正社員" : "契約社員";
			System.out.printf("%s (%s) の給与: %,d 円%n", emp.name , type, wage);
		}
		for (Employee emp : list) {
			int wage = emp.calculateDailyWage(7);
			System.out.printf("%s の給料: %,d 円%n", emp.name, wage);
		}

	}

}
