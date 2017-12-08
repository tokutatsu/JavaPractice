package quiz;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner scanner1 = new Scanner(System.in);
	public static Random ran = new Random();
	public static Mondai mondai = new Mondai();
	public static int a;
	public static int NUM = 2;

	public static void main(String[] args) {

		System.out.println("例：1価の陽イオン→1+ 1価の陰イオン→1-");

		int retry;
		do {

			a = ran.nextInt(NUM);

			mondai.Mondai(a);

			System.out.println("もう一度:1、終わり0:");

			retry = scanner1.nextInt();

		} while(retry == 1);

	}

}
