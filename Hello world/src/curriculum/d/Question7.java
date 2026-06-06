package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("プレイヤー名を入れてください");
		String playerName = sc.nextLine();
		Random rand = new Random();
		Character player = new Character(
				playerName,
				rand.nextInt(100) + 30,
				rand.nextInt(10) + 5,
				rand.nextInt(10) + 1);

		Character deamon = Character.loadDeamon();

		System.out.println(
				player.getName() + "HP: " + player.getHp() + "AT: " + player.getAt() + "SP: " + player.getSp());
		System.out.println(
				deamon.getName() + "HP: " + deamon.getHp() + "AT: " + deamon.getAt() + "SP: " + deamon.getSp());

		battle(player, deamon);
		System.out.println();

		sc.close();

	}

	private static void battle(Character player, Character deamon) {
		try (PrintWriter pw = new PrintWriter(new FileWriter("battle_log.txt"))) {
			pw.println(player.getName() + "vs" + deamon.getName() + "\n");
			boolean playerTurn = (player.getSp() > deamon.getSp())
					|| (player.getSp() == deamon.getSp() && new Random().nextBoolean());

			while (player.getHp() > 0 && deamon.getHp() > 0) {

				if (playerTurn) {
					player.attack(deamon);
					pw.println(player.getName() + "の攻撃" + deamon.getName() + "HP:" + deamon.getHp());
				} else {
					deamon.attack(player);
					pw.println(deamon.getName() + "の攻撃" + player.getName() + "HP:" + player.getHp());
				}
				System.out.println(
						player.getName() + "HP:" + player.getHp() + "|" + deamon.getName() + "HP:" + deamon.getHp());

				playerTurn = !playerTurn;
			}

			String win;
			if (player.getHp() > 0) {
				win = player.getName();
				System.out.println("\n" + win + "の勝利");
			} else {
				win = deamon.getName();
				System.out.println("\n" + win + "の勝利");
			}
			pw.println("\n 結果　");
			pw.println(win + "の勝利");

		} catch (IOException e) {
			System.out.println("書き込みエラー");
		}

	}
}