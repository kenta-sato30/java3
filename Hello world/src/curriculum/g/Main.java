package curriculum.g;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployeeld("E002");
		emp.setName("田中花子");
		System.out.println("社員ID:" + emp.getEmployeeld() + "、名前:" + emp.getName());
	}

}
