package ch04.unit4;
//label

public class BreakEx01 {
	public static void main(String[] args) {
		//
		int n,s;
		n=s=0;
		
		//break : while, do~while, for, switch ~ case 에서 사용
		//		:제어문을 빠져 나옴
		
		
		// 1~n 까지 합이 1000이 넘는 최초의 수와 합 출력
		while(true) {
			n++;
			s+=n;
			if(s>1000) {
				break;
			}
		}
		System.out.println("수:" +n);
		System.out.println("합:" +s);
	}
}
