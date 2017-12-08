package quiz;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static int a;
	public static int NUM = 5;

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		Random ran = new Random();
		Mondai mondai = new Mondai();

		System.out.println("例：1価の陽イオン→1+ 1価の陰イオン→1-");

		int retry;
		do {

			a = ran.nextInt(NUM);

			mondai.ion(a);

			System.out.println("もう一度:1、終わり0:");

			retry = scanner1.nextInt();

		} while(retry == 1);

		scanner1.close();
	}
}