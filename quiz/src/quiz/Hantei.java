package quiz;

import java.util.Scanner;

public class Hantei {
	static Scanner scanner2 = new Scanner(System.in);
	public static int NUM = 2;

	void judge(int a) {
		String[] seikai = new String[NUM];
		seikai[0] = "1-";
		seikai[1] = "1+";
		String[] kaitou = new String[NUM];
		kaitou[a] = scanner2.next();

		if (kaitou[a].equals(seikai[a])) {
			System.out.println("正解");
		}
		else {
			System.out.println("不正解");
		}
	}
}
