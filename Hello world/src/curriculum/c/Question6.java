package curriculum.c;

import java.util.Random;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] orgs) {
		try (Scanner stdin = new Scanner(System.in)) {
			while (true) {
				int user = getUser(stdin);

				int cpu = getCpu();

				String result = resultJunken(user, cpu);

				showResult(user, cpu, result);

				if (result.equals("勝ち")) {
					System.out.println("あなたの勝ち！");
					break;
				}
				System.out.println("もう一度\n");
			}
		}

	}

	public static int getUser(Scanner stdin) {

		while (true) {

			System.out.print("(グー(0), チョキ(1), パー(2)を入力) -->");

			String line = stdin.nextLine().trim();

			try {
				int input = Integer.parseInt(line);
				if (input >= 0 && input <= 2) {
					return input;
				}
			} catch (NumberFormatException e) {

			}
			System.out.println("入力出来るのは0～2までです");
		}

	}

	public static int getCpu() {
		Random rand = new Random();
		return rand.nextInt(3);
	}

	public static String resultJunken(int user, int cpu) {
		if ((user == cpu)) {
			return "あいこ";
		}
		if ((user == 0 && cpu == 1) || (user == 1 && cpu == 2) || (user == 2 && cpu == 0)) {
			return "勝ち";
		} else {
			return "負け";
		}

	}

	public static void showResult(int user, int cpu, String result) {
		String[] janken = { "グー", "チョキ", "パー" };
		System.out.println("あなたの手:" + janken[user] + " CPUの手:" + janken[cpu]);
		System.out.println(result);
	}

}
