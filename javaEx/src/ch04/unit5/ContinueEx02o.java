package ch04.unit5;

import java.util.Scanner;
// 잘못 입력되어 실행된 내용을 되돌릴 때
//continue에서 i-- 롤 잘못 입력한 값을 되돌릴 수 있다.
public class ContinueEx02o {
	public static void main(String[] args) {
		//5개의 실수를 입력 받아 0보다 큰 수의 합 구하기
		Scanner sc= new Scanner(System.in);
		double input, s;
		s=0;
		System.out.print("실수 5개?");
		for(int i=0;i<5;i++) {
			input= sc.nextDouble();
			if(input<=0) {
				i--;
				//for문의 i를 줄여서 만들수있다.
				continue;
			}
			s+=input;
		}
		System.out.println("결과:"+s);
		sc.close();
		
	}
}
