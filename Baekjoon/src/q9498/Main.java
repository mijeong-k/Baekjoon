package q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//1.if else문
//		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
//		sc.close();

//		int ran = 100;
//		if (ran-10 <= score && score <= ran) {
//			System.out.println("A");
//		} else if (ran-20 <= score && score < ran-10) {
//			System.out.println("B");
//		} else if (ran-30 <= score && score < ran-20) {
//			System.out.println("C");
//		} else if (ran-40 <= score && score < ran-30) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		
		//2.switch문
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int s = num/10;
		switch(s) {
		case 10 :
		case 9 :
			System.out.println("A");
			break;		
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		
		//3.switch문
//		Scanner scan = new Scanner(System.in);
//	      int score = sc.nextInt();
//	      char grade;
//	      sc.close();
//
//	      switch (score / 10) {
//	      case 10:
//	      case 9:
//	         grade = 'A';
//	         break;
//	      case 8:
//	         grade = 'B';
//	         break;
//	      case 7:
//	         grade = 'C';
//	         break;
//	      case 6:
//	         grade = 'D';
//	         break;
//	      default:
//	         grade = 'F';
//	         break;
//	      }
//	      System.out.println(grade);
//	   }


	}
}

