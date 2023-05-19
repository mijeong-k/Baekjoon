package q2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		//1.for문
		for (int i = 1; i <= inp; i++) {
			System.out.println(i);
		}
	
		//2. while문
		int i=1;
		while(i<=inp) {
			System.out.println(i);
			i++;
		}
		
		//3.do~while문
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<=inp);

	}

}
