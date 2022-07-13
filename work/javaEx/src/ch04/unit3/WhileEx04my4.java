package ch04.unit3;

import java.util.Scanner;

public class WhileEx04my4 {

	public static void main(String[] args) {
		//단을 입력 받아 구구단 출력하기
		Scanner sc= new Scanner(System.in);
		int dan, n;
		
		System.out.print("단 ? ");
		dan = sc.nextInt();
		
		n=0;
		while(n<9) {
			n++;
			System.out.printf("%d * %d = %2d\n",dan, n, dan*n);
		}
		sc.close();
	}
}