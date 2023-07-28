package q2443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 0; i < inp; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < (inp-i) * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 9 7 5 3 1 -----> 10 8 6 4 2 0

		// 0 1 2 3 4 -----> 1 2 3 4 5
	}

}
