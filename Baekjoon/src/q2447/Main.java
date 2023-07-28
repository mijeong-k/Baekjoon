package q2447;

public class Main {

	public static void main(String[] args) {
		String[][] str1 = { { "***","???","***" }, { "* *","???","* *" }, { "***","???","***" } };
		String[][] str2 = { { "???" }, { "???" }, { "???" } };
		

		
//		System.out.println(str1);
//		String total1=str1[0][0]+str1[0][1]+str1[0][2]+"   "+str1[0][0]+str1[0][1]+str1[0][2];
//		String total2=
		
		for(int i=0; i<str1.length-2; i++) {
			for(int k=0; k<3; k++) {
				System.out.print(str1[i][i+k]);
			}
		}

	}
}

// ?
//0
//1
//3


//9
//1 2 2 1
//9


//3 3


//9
//1 2 2 1
//9