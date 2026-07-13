package curriculum_B;

public class Question5 {

	public static void helloWorld() {//Q1のメソッド
		System.out.println("Hello, World!");
		}
	public static int doubleValue(int num) { //Q2のメソッド
		return num * 2;
		}
	public static boolean isEven(int num) { //Q3のメソッド
		return num % 2 == 0;
		}
	public static void main(String[] args) {
		helloWorld();//Q1
		System.out.println();
		
		int value = 10;//Q2
		int result =doubleValue(value);
		System.out.println( value + "を2倍にすると" + result + "です。");
		System.out.println();
		
		int num1 = 7;//Q3
		int num2 = 10;
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です");
		} else {
			System.out.println(num2 + "は奇数です");
		}
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です");
		} else {
			System.out.println(num1 + "は奇数です");
		}
		System.out.println();
		
		Greeting.sayHello();//Q4
		System.out.println();
		
		Animal lion = new Animal();//Q5
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		System.out.println("動物名:" + lion.getName());
		System.out.println("体長:" + lion.getLength());
		System.out.println("速度:" + lion.getSpeed());
	}

}
