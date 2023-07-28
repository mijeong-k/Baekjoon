package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] num = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			num[i] = arr[i] % 42;
		}
		sc.close();

		// 3단계 : 숫자 counting
		int cnt = 0;
		for (int i = 0; i < 42; i++) {
			boolean chk = false;
			for (int j = 0; j < num.length; j++) {
				if (i == num[j]) {
					chk = true;
				}
			}
			if (chk == true) {
				cnt++;
			}
		}
		System.out.println(cnt);		
		
		
		
//		  int[] iNums = new int[10];
//	      int[] iNums2 = new int[42];
//	      int iC = 0;
//	      for (int i = 0; i < iNums.length; i++) {
//	         iNums[i] = sc.nextInt() % 42;
//	      }
//
//	      sc.close();
//
//	      for (int i = 0; i < iNums.length; i++) {
//	         for (int j = 0; j < 42; j++) {
//	            if (iNums[i] == j) {
//	               iNums2[j] += 1;
//	            }
//	         }
//	      }
//
//	      for (int i = 0; i < 42; i++) {
//	         if (iNums2[i] != 0) {
//	            iC++;
//	         }
//	      }
//	      System.out.print(iC);

		
		
		
//		int cnt = 0;
//
//		for (int k = 0; k < 42; k++) {
//			if (num[0] == k || num[1] == k || num[2] == k || num[3] == k || num[4] == k || num[5] == k || num[6] == k
//					|| num[7] == k || num[8] == k || num[9] == k) {
//				cnt++;
//			} else {
//				break;
//			}
//		}
//		System.out.println(cnt);
		

	}

}
