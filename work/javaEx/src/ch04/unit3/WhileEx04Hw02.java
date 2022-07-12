package ch04.unit3;

//반복문while20기본문제2
public class WhileEx04Hw02 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+7..9-10 연산결과 출력
		int n,s;
		n=0;s=0;
		while(n<=
				10) {
			if(n%2==0) {
				s-=n;
			}else if(n%2!=0) {
				s+=n;
			}
			n++;
		}
		System.out.printf("결과  : %d", s);
	}
}