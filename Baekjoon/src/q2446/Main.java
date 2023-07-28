package q2446;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp=sc.nextInt();
		sc.close();

		for (int i = 0; i < inp; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < inp * 2 - (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < inp - 1; i++) {
			for (int k = 1; k < inp - (i + 1); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j < (2 * (i + 1)) + 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}