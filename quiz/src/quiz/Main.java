package quiz;

import java.util.Random;
import java.util.Scanner;



public class Main {
	static Scanner scanner1 = new Scanner(System.in);

	static void Hantei(int a) {
		String[] seikai = new String[1];
		seikai[0] = "1-";
		Scanner scanner1 = new Scanner(System.in);
		String[] kaitou = new String[1];
		kaitou[a] = scanner1.next();

		if (kaitou[a].equals(seikai[a])) {
			System.out.println("正解");
		}
		else {
			System.out.println("不正解");
		}
	}

	static void Mondai() {
		Random ran= new Random();
		int a = ran.nextInt(1);

		switch(a) {
			case 0 :
				System.out.print("塩化物イオン:");
				Hantei(a);
				break;
		}
	}


	public static void main(String[] args) {

		System.out.println("例：1価の陽イオン→1+ 1価の陰イオン→1-");

		int retry;
		do {

			Mondai();

			System.out.println("もう一度:1、終わり0:");

			retry = scanner1.nextInt();

		} while(retry == 1);

	}

}
