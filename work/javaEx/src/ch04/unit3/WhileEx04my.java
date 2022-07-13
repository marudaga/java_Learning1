package ch04.unit3;

import java.util.Scanner;

public class WhileEx04my {

	public static void main(String[] args) {
		//정수를 입력 받아 입력 받은 정수까지 홀수합 구하기
		//단 양수를 입력한다는 가정하에 문제 해결
		Scanner sc = new Scanner(System.in);
		int num,s,n;
		n=1;s=0;
		System.out.println("정수값 ?");
		num = sc.nextInt();
		System.out.println("정수의 합 :");
		while(n<=num) {
			s+=n;
			n+=2;
		}
		System.out.printf("정수의 합 :%d\n",s);
		sc.close();
	}
}