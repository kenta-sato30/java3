package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Billable> billables =new ArrayList<>();
		billables.add(new FullTimeEmployee("001","佐藤"));
		billables.add(new ContractEmployee("002","加藤"));
		System.out.println();
		for(Billable b : billables) {
			int cost = b.costForDay(9);
			
			String type = (b instanceof FullTimeEmployee) ? "正社員" : "契約社員";
			String name = (b instanceof Employee) ? ((Employee)b).name : "不明";
			System.out.printf("%s (%s) の日給: %,d 円%n", name, type, cost);
		}
	}

}
