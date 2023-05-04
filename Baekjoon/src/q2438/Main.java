package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		String str = "";
		if (1 <= inp && inp <= 100) {
			for (int i = 0; i < inp; i++) {
				str = str + "*";
				System.out.println(str);
			}

		}
	}

}


