package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();


//		for (int i = 0; i < inp; i++) {
//			for (int m = 0; m <= i; m++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int num = 0;
		for (int i = 0; i < inp; i++) {
			for (int m = 0; m <= num; m++) {
				System.out.print("*");
			}
			num++;
			System.out.println();
		}
		
		
		
//		String str = "";
//		if (1 <= inp && inp <= 100) {
//			for (int i = 0; i < inp; i++) {
//				str = str + "*";
//				System.out.println(str);
//			}
//
//		}
	}

}


