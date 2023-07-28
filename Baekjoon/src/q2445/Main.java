package q2445;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 0; i < inp; i++) {
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			for (int j = 0; j < (inp * 2) - (i + 1) * 2; j++) {
				System.out.print(" ");
			}
			for (int m = 0; m < i + 1; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < inp-1; i++) {
			for (int k = 0; k < inp - (i + 1); k++) {
				System.out.print("*");
			}
			for (int j = 0; j < (i + 1) * 2; j++) {
				System.out.print(" ");
			}
			for (int m = 0; m < inp - (i + 1); m++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
