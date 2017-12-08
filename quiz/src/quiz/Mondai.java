package quiz;

public class Mondai {
	static Hantei hantei = new Hantei();
	
	public void Mondai(int a) {

		switch(a) {
			case 0 :
				System.out.print("塩化物イオン:");
				hantei.judge(a);
				break;
			case 1 :
				System.out.print("ナトリウムイオン:");
				hantei.judge(a);
				break;
		}
	}
}
