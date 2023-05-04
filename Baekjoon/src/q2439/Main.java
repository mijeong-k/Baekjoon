package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		int num = 0;
		for (int i = 0; i < inp; i++) {
			for (int i1 = 1; i1 < inp - num; i1++) {
				System.out.printf(" ");
			}
			for (int i2 = 0; i2 <= num; i2++) {
				System.out.print("*");
			}
			System.out.print("\n");
			num++;
		}
	}

}
