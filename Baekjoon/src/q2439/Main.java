package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

//		int num = 0;
//		for (int i = 0; i < inp; i++) {
//			for (int m = 1; m < inp - num; m++) {
//				System.out.print(" ");
//			}
//			for (int n = 0; n <= num; n++) {
//				System.out.print("*");
//			}
//			num++;
//			System.out.println();
//		}
		
		
//		for (int i = 0; i < inp; i++) {
//			for (int m = 0; m < inp -i -1; m++) {
//				System.out.print(" ");
//			}
//			for (int n = 0; n <= i; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < inp; i++) {
//			for (int m = 1; m < inp -i; m++) {
//				System.out.print(" ");
//			}
//			for (int n = 0; n <= i; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < inp; i++) {
//			for (int j=inp-i-1; j>0; j--) {
//				System.out.print("?");
//			}
//			for (int j = 0; j<1+i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		 for (int i = 0, j = inp; i < inp; /*|| j < inp && j > 0;*/ i++, j--) {
	         String b = " ".repeat(j - 1);
	         String s = "*".repeat(i + 1);
	         System.out.println(b + s);
	      }
		 

	   }

	}



//		제일 바깥쪽 for문은 행
//		그 다음 for문들은 열



