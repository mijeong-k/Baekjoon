package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i]);
				cnt++;
				if (cnt != X - 1) {
					System.out.print(" ");
				}
			}
		}
	}
}
