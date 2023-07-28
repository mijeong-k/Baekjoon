package q10039;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();

		StudentInfo students = new StudentInfo();

		students.setScore(score);
		students.scoreAvg();
	}
}
