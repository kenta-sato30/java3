package curriculum_B;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { //Q1
			System.out.println(i);

		}

		for (int i2 = 2; i2 <= 20; i2++) { //Q2
			if (i2 % 2 == 0)
				System.out.println(i2);

		}

		for (int i3 = 10; i3 >= 1; i3--) { //Q3
			System.out.println(i3);

		}
		int sum = 0;
		for (int i4 = 1; i4 <= 100; i4++) { //Q4
			sum += i4;
		}
		System.out.println(sum);

		for (int i5 = 0; i5 < 5; i5++) { //Q5
			for (int j = 0; j <= i5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int count = 1; //Q6
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		int count2 = 2; //Q7
		while (count2 <= 20) {
			if (count2 % 2 == 0) {
				System.out.println(count2);
			}
			count2++;
		}

		int count3 = 10; //Q8
		while (count3 >= 1) {
			System.out.println(count3);
			count3--;
		}

		int count4 = 1; //Q9
		int sum2 = 0;
		while (count4 <= 100) {
			sum2 += count4;
			count4++;
		}
		System.out.println(sum2);

		Scanner scanner = new Scanner(System.in); //Q10
		int user = 0;
		while (true) {
			user = scanner.nextInt();
			if (user == 0) {
				break;
			}
			System.out.println(user);
		}
		System.out.println("終了しました");
		scanner.close();

		int[] kuku = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //Q11
		for (int y : kuku) {
			for (int x : kuku) {
				System.out.printf(" %d*%d=%2d", y, x, y * x);
			}
			System.out.println();
		}

	}
}
