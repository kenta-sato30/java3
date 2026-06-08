package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Character {
	private String name;
	private int hp;
	private int at;
	private int sp;

	public Character(String name,int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	public static Character loadDeamon() {
		try (BufferedReader br = new BufferedReader(new FileReader("deamon_status.txt"))){
			String name = br.readLine().trim();
			int hp = Integer.parseInt(br.readLine().trim());
			int at = Integer.parseInt(br.readLine().trim());
			int sp = Integer.parseInt(br.readLine().trim());
			
			return new Character(name,hp,at,sp);
		} catch (IOException | NumberFormatException e) {
			System.out.println("ファイル読み込みエラー" + e.getMessage());
			
			
			return new Character("Deamon", 85, 12, 6);
		} 
	}
	
	public void attack(Character target) {
		int damage = this.at;
		target.hp -= damage;
		
		target.setHp(target.getHp() - damage);
		System.out.println(this.name + "の攻撃" + target.getName() + "に" + damage + "ダメージ");
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
	
	public String getName() {return name;}
	public int getHp() {return hp;}
	public int getAt() {return at;}
	public int getSp() {return sp;}
	
	public void setHp(int hp) {
		this.hp = hp;
		if(this.hp < 0) this.hp = 0;
		}
	
}
