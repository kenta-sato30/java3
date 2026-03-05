package curriculum.j;

public abstract class Employee implements Billable {
	
	private String id;
	private String name;
	
	public Employee(String id , String name) {
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	

}
