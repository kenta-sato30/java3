package curriculum_A;

public class Question1 {

	public static void main(String[] args) {

        byte byteNum; //Q1
        short shortNum;
        int intNum;
        long longNum;
        float floatNum;
        double doubleNum;
        char letter;
        String letters;
        boolean isBoolean;
        
        byteNum = 10;  //Q2
        shortNum = 100;
        intNum = 1000;
        longNum = 10000L;
        floatNum = 9.5f;
        doubleNum = 10.5;
        letter = 'a';
        letters = "ハロー";
        isBoolean = true;
        
        
        System.out.println(byteNum + shortNum + intNum + longNum);  //Q3
        System.out.println(floatNum + doubleNum);
        System.out.println(letter + letters + isBoolean);
        System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum); 
        System.out.println(byteNum * shortNum * intNum * longNum);
        System.out.println(doubleNum / shortNum);
        System.out.println(byteNum - shortNum);
        
        String name; //Q4
        name = "山田太郎";
        System.out.println("こんにちは、" + name + "さん!");
        
        int age; //Q5
        age = 25;
        System.out.println("年齢" + age + "歳");
        
        int num1; //Q6
        num1 = 10;
        int num2;
        num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);
        
        int score; //Q7
        score = 80;
        score = score + 20;
        System.out.println("最終スコア:" + score);
        
        double price; //Q8
        price = 99.99;
        int price2 = (int) price;
        System.out.println("整数価格:" + price2);
        
        String numStr; //Q9
        numStr = "123";
        int num3 =Integer.parseInt(numStr);
        System.out.println("変換後の値" + (num3 + 10));
        
        
        int num; //Q10
        num = 50;
        String str = String.valueOf(num);
        System.out.println("得点:" + str + "点");
        
        int a; //Q11
        a = 10;
        int b;
        b = 20;
        boolean result;
        result = (a < b);
        System.out.println(result);
        
        int x; //Q12
        x = 15;
        String result1 = (x >= 10) ? "OK" : "NG";
        System.out.println(result1);
        
        String text = "私はJavaが好きです。Javaは楽しい！"; //Q13
        System.out.println(text.replace ("Java" , "Python"));
        
	}

}
