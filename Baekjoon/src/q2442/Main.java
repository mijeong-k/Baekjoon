package q2442;

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
	}

}
