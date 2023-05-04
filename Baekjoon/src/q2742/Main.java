package q2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int sum = 0; (inp - sum) > 0; sum++) {
			System.out.println(inp - sum);
		}

	}

}
