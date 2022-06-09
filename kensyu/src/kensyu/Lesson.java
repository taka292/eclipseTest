package kensyu;

//import java.*;
class c {
	//	String s = "これはインスタンスメソッドです";
	String si;
	static String ss;

	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public static String getSs() {
		return ss;
	}

	public static void setSs(String sss) {
		ss = sss;
	}

}

public class Lesson {
	public static void main(String[] args) {
		c.setSs("これはスタティックしたもの");
		System.out.println(c.getSs()); 
		c c1 = new c();
		c1.setSi("d");
		System.out.println(c1.getSi());
		c1.setSs("これはc1のスタティックしたもの");
		System.out.println(c1.getSs());
		
//		c.setSi("d");
//		System.out.println(c.getSi());
//		System.out.println(1);		
//		float n = 0.11F;
////		float n = 1.23f;
//			System.out.println("float : product");
//		
//		for (float i = 0f; i < n; i += 0.01) {
//			System.out.println(i + " " + (i * i));
//		}
//		int n = 6;
//		Random r = new Random();
//		int h[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			h[i] = r.nextInt(10 + 1) + 1;
//			System.out.println(h[i]);
//		}
//		 Scanner sc = new Scanner(System.in);
//		String week [] = {"M", "T", "W", "T", "F", "S", "Sun"};
//		String week2 [] = {"月", "火", "水", "木", "金", "土", "日"};
//		System.out.println("英語の曜日名を小文字で入力");
//		int judge = 0;
//		Random r = new Random();
//		while (judge == 0) {
//			int i = r.nextInt(6 + 0) + 0;
//			String ans = week[i];
//			String ansJ = week2[i];
//			System.out.println(ansJ +"を入力");
////			System.out.println();
//			String w = sc.next();
//			if (ans.equals(w)) {
//				System.out.println("正解");
//				judge =1 ;
//			} else {
//				System.out.print("もう一度？: 1...Y 0...N");
//				int n  = sc.nextInt();
//				if (n == 0) {
//					break;
//				} 
//			}
//			
//		}
//		sc.close();
//		54
//		int jap[] = new int[6];
//		int eng[] = new int[6];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 6; i++) {
//			System.out.println(i + 1 + "番の成績");
//			System.out.println("国語: ");
//			int n1 = sc.nextInt();
//			jap[i] = n1;
//			System.out.println("英語: ");
//			int n2 = sc.nextInt();
//			eng[i] = n2;
//		}
//		int totalJ = 0;
//		int totalE = 0;
//		for (int p :jap) {
//			totalJ += p;
//		}
//		for (int e :eng) {
//			totalE += e;
//		}
//		int avgJ = totalJ / 6;
//		int avgE = totalE / 6;
//		
//		System.out.println("国語平均: " + avgJ);
//		System.out.println("国語平均: " + avgE);
//		
//		for (int i = 0; i < 6; i++) {
//		}
//		sc.close();
		
		 
	}
}
