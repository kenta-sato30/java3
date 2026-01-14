package curriculum.e;

public class Employee {

	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void work() {
		System.out.println(name + "は働いています。");
	}
	
}
