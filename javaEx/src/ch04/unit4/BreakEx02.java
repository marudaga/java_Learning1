package ch04.unit4;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		//실수를 입력 받아 입력 받은 수의 합 구하기
		//단, 입력 받은 수가 0 이하이면 종료
		Scanner sc= new Scanner(System.in);
		double input,sum;
		System.out.print("실수입력[0이하이면종료] ?");
		sum=0;
		while(true) {
			input = sc.nextDouble();
			if(input<=0.0) {
				break;
			}
			sum+=input;
		}
		System.out.println("결과:"+sum);
		
		sc.close();
		
	}
}
