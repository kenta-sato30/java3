package curriculum_B;

public class Question2 {

	public static void main(String[] args) {
         int score; //Q1
         score = 75;if(score >= 60) { System.out.println("合格です！");}
         
         
         int age; //Q2
         age = 25;
         if (age >= 20 && age <= 30) {  System.out.println("適正年齢です");
         }else { 
        	 System.out.println("対象外です");
         }
         
         int age2; //Q3
         age2 = 18;if(age2 >= 20) { System.out.println("成人です");
         }else if(age2 >= 13 && age2 <= 19) { System.out.println("ティーンエイジャーです");
         }else if(age2 <= 12) { System.out.println("子供です");
         }
         
         int x = 30; //Q4
         int y = 15;
         int z = 50;
         int xyz = x;
         if (xyz < y) xyz =y;
         if (xyz < z) xyz =z;
         System.out.println(xyz);
         
         int num = 0;if(num > 0) { System.out.println("正の数です"); //Q5
         }else if(num == 0) {  System.out.println("0です"); 
         }else if(num < 0) { System.out.println("負の数です"); 
         }
          
         int value = 1;if(value % 2 == 0 ) { System.out.println("偶数です"); //Q6
         }else {  System.out.println("奇数です");
         }
        
         int score2 = 100;if(score2 >= 90) {  System.out.println("優");//Q7
         }else if(score2 >= 70) {  System.out.println("良");
         }else if(score2 >= 50) {  System.out.println("可");
         }else if(score2 < 50) {  System.out.println("不可");
         }
         
         String result = ""; //Q8
         if(result == null || result.isEmpty()) { System.out.println("入力が無効です"); 
         }
         
         
	}
	}


