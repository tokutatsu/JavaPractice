package quiz;

import java.util.Scanner;

public class Hantei {
	public static int NUM = 5;

	void judge(int a) {
		Scanner scanner2 = new Scanner(System.in);

		String[] seikai = new String[NUM];
		seikai[0] = "1-";
		seikai[1] = "1+";
		seikai[2] = seikai[3] = "2+";
		seikai[4] = "2-";
		
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
