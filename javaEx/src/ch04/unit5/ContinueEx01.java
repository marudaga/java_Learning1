package ch04.unit5;

import java.util.Scanner;

public class ContinueEx01 {
	public static void main(String[] args) {
		//정수를 입력 받아 입력 받은 수중 짝수의 합 구하기
		//단, 입력 받은 수가 0이하이면 프로그램 종료
		int n,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력[0:종료]..");
		while(true) {
			n=sc.nextInt();
			if(n<=0) {
				break;
			}
			
			if(n%2==1) {
				continue;
			}
			s+=n;
		}
		System.out.print("합:"+s);
		sc.close();
		
	}
}
