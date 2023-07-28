package q2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 0; i < inp; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < inp - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}