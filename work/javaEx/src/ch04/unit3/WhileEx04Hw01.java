package ch04.unit3;

import java.util.Scanner;

//반복문while20기본문제1
public class WhileEx04Hw01 {

	public static void main(String[] args) {
		// 정수를 입력받아 1부터 입력수까지의 합, 짝수합 홀수 합을 구하는 프로그램
		int n, sum, evensum, oddsum, i;
		n = 0;
		sum = 0;
		evensum = 0;
		oddsum = 0;
		i = 0;
		System.out.println("수 ? ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while (i < n) {
			i++;
			if (i % 2 == 0) {
				evensum += i;
			} else if (i % 2 != 0) {
				oddsum += i;
			} 
			sum=evensum+oddsum;
		}
		System.out.printf("1~100 까지 합 = %d\n", sum);
		System.out.printf("1~100 까지 짝수합 = %d\n", evensum);
		System.out
		.printf("1~100 까지 홀수합 = %d\n", oddsum);
		sc.close();
	}
}