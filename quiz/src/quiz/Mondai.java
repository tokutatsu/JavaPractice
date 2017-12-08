package quiz;

public class Mondai {
	Hantei hantei = new Hantei();

	public void ion(int a) {

		switch(a) {
			case 0 :
				System.out.print("塩化物イオン:");
				hantei.judge(a);
				break;
			case 1 :
				System.out.print("ナトリウムイオン:");
				hantei.judge(a);
				break;
			case 2 :
				System.out.print("銅イオン:");
				hantei.judge(a);
				break;
			case 3 :
				System.out.print("マグネシウムイオン:");
				hantei.judge(a);
				break;
			case 4 :
				System.out.print("硫酸イオン:");
				hantei.judge(a);
				break;
		}
	}
}
