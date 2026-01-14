package curriculum.f;

public class Employee {

	private String employeeld;

	private String name;

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showinfo() {
		System.out.println(employeeld + name);
	}
}
