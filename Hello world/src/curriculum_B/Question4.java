package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int[] score = {1, 2, 3, 4, 5 }; //Q1
		for (int i : score) {
			System.out.println(i);
		}
		System.out.println();

		Integer[] score2 = {1, 2, 3, 4, 5 }; //Q2
		for (int i = score2.length - 1; i >= 0; i--) {
			System.out.println(score2[i]);
		}
		System.out.println();

		int[] score3 = { 3, 5, 7, 9, 11 }; //Q3
		int sum = 0;
		for (int number : score3) {
			sum += number;
		}
		System.out.println(sum);
		System.out.println();
		
		int[] score4 = {12, 7, 9, 21, 5, 18}; //Q4
		int max = score4[0];
		int min = score4[0];
		for (int i = 1; i < score4.length; i++) {
			if (score4[i] > max) {
				max = score4[i];
			}
			if (score4[i] < min) {
				min = score4[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println();
		
		int[] score5 = { 1, 2, 3, 4, 5}; //Q5
		for (int num : score5) {
			System.out.println(num * 2);
		}
		System.out.println();
		
		int[] score6 = {4, 7, 10, 15, 20}; //Q6
		boolean found = false;
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		for (int u : score6) {
			if ( u == user) {
				found = true;
				break;
			}
		}
		scanner.close();
		if (found) {
			System.out.println( user + "は配列に含まれています");
		} else {
			System.out.println( user + "は配列に含まれていません");
		}
		System.out.println();
		
		int[][] array = {{1,2},{3,4},{5,6}}; //Q7
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
		
		int[][] array2 = {{10,20,30},{40,50,60},{70,80,90}}; //Q8
		int sum2 = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				sum2 += array2[i][j];
			}
		}
		System.out.println(sum2);
		System.out.println();
		
		int[][] array3 = {{12,15,8},{6,19,25},{30,2,10}}; //Q9
		int max2 = array3[0][0];
		int min2 = array3[0][0];
		for (int[] row : array3) {
			for (int number : row) {
				if (number > max2) {
					max2 = number;
				}
				if (number < min2) {
					min2 = number;
				}
			}
		}
		System.out.println(max2);
		System.out.println(min2);
		System.out.println();
		
		int[][][] array4 = {{{1,2},{3,4}},{{5,6},{7,8}}}; //Q10
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[i].length; j++) {
				for (int h = 0; h < array4[i][j].length; h++) {
					System.out.println(array4[i][j][h]);
				}
				System.out.println();
			}
		}
		
	
	}

}
