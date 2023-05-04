package q2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int sum = 1; (inp - inp) + sum <= inp; sum++) {
			System.out.println((inp - inp) + sum);
		}
		
	}

}
