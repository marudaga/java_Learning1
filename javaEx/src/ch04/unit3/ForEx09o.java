package ch04.unit3;

public class ForEx09o {

	public static void main(String[] args) {
		//별찍기 피라미드
		for(int i=1;i<=5; i++) {
			for(int j=1; j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();

//		int s=5;
//		for(int i=0; i<s; i++) {
//			for(int j=s; j>0;j--) {
//				System.out.print(j<= i+1 ? "*":" ");
//			}
//			System.out.println();
			// i=0, j=5~1   공백4,별1
			// i=1, j=5~1   공백3,별2
			// i=2, j=5~1   공백2,별3
			// i=3, j=5~1   공백1,별4
			// i=4, j=5~1   공백0,별5
		}
	}
}


