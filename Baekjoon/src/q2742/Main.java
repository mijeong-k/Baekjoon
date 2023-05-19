package q2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		//1.for문
		for (int i = inp; i > 0; i--) {
			System.out.println(i);
		}

		//2.while문
		int i=0;
		while(i<inp) {
			System.out.println(inp - i);
			i++;
		}
		
		//3.do~while문
		int j=inp;
		do {
			System.out.println(j);	
			j--;
		}while(j>0);
	}

}
