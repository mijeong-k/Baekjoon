package q10039;

public class StudentInfo {
	private int[] score;
	
	//Set
	void setScore(int[] score) {
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 5 == 0) {
				this.score = score;
			} else {
				System.out.println("점수는 5의 배수로 입력하세요.");
			}
		}
	}

	//Run
	void scoreAvg() {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 5 == 0) {
				if (score[i] < 40) {
					score[i] = 40;
				}
			} else {
				score[i] = -1000;
			}
			sum += score[i];
		}//for close

		if (sum / score.length < 0) {
			System.out.println("평균을 계산할 수 없습니다.");
		} else {
			System.out.println(sum / score.length);
		}//if close	
		
	}//scoreAvg() close
}
