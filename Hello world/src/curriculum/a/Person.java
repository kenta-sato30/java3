package curriculum.a;

public class Person {
	String name; //インスタンスフィールドを定義
	int age;
	double height;
	double weight;
	double bmi;
	
	//コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi();
	}
	public double bmi() {
		return this.weight / (this.height * this.height);
	}
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.2fです%n" , this.bmi());
		
		
	}


}
