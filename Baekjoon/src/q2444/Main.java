package q2444;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 0; i < inp; i++) {
			for (int k = 1; k < inp - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2 * (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < inp - 1; i++) {
			for (int k = 0; k < i + 1; k++) {
				System.out.print(" ");
			}
			for (int m = 1; m < 2 * (inp - (i + 1)); m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		int sum = 3;
//		
//		for (int i = 0; i < inp * 2 - 1; i++) {
//			sum--;
//			if (0<sum&&sum%2 == 0) {
//				for(int n=0; n<inp; n++) {
//				for (int k = 1; k < inp - n; k++) {
//					System.out.print("?");
//				}
//				for (int j = 1; j < 2 * (n + 1); j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//				}
//			} else if (0<sum&&sum%2 != 0) {
//				for(int n=0; n<inp-1; n++) {
//				for (int k = 0; k < n + 1; k++) {
//					System.out.print("!");
//				}
//				for (int m = 1; m < 2 * (inp - (n + 1)); m++) {
//					System.out.print("*");
//				}
//				System.out.println();
//				}
//			}else if(sum==0){
//				break;
//			}
//		}
	}

}



// 4 3 2 1 0     1      2 3 4    ---->    5 4 3 2     1     2 3 4 5
// 1 3 5 7   9   7 5 3 1 ----> 2 4 6 8    10   8 6 4 2

// 1 2 3 4   2345
// 7 5 3 1   8642