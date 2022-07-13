package ch04.unit7;


public class ForHw3 {

	public static void main(String[] args) {
		// 구구단 4줄 씩 가로로 짜기

		
		for(int n=1;n<=9;n++)
		{
			for(int dan=2;dan<=5;dan++) {
				
				System.out.printf(" %d * %d =%2d  ",dan,n,dan*n);
				}
			System.out.println();
		}	
		System.out.println();
		
		for(int n=1;n<=9;n++)
		{
			for(int dan=6;dan<=9;dan++) {
				
				System.out.printf(" %d * %d =%2d  ",dan,n,dan*n);
				}
			System.out.println();
		}
		int dan;
		for(int i=0;i<2;i++) {
			for(int j=1; j<=9;j++) {
				for(int k=2; k<=5;k++) {
					dan = i*4+k;
					System.out.printf(" %d * %d =%2d  ",dan, j,dan*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}