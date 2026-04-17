package curriculum.a;

import java.util.ArrayList;


class Main {
	public static void main(String[] args) {
		ArrayList<Person> people =new ArrayList<>();
		
		people.add(new Person("鈴木太郎",20,1.7,60));
		
		for (Person p : people) {
		p.print();
		}
		
		System.out.println("合計" + people.size() + "人です");
	}
	

}
