package ch04.unit3;

import java.util.Scanner;

//반복문while20기본문제6
public class WhileEx04Hw06 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 입력 받은 수중 적은수에서 큰수까지의 합을 출력하는 프로그램
		int big,sma,temp,s;
		s=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("두수 ?");
		big=sc.nextInt();
		sma=sc.nextInt();
		
		if(big-sma>=0) {}
		else if(big-sma<0) {
			temp=big;
			big=sma;
			sma=temp;
		}
		while (true) {
			s=big*(big+1)/2-(sma-1)*(sma)/2;
			break;
		}System.out.printf("%d ~ %d까지의 합 = %d",sma,big,s);	
		sc.close();
	}
}