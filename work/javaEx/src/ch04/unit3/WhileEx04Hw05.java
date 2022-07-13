package ch04.unit3;

//반복문while20기본문제5
public class WhileEx04Hw05 {

	public static void main(String[] args) {
		// 1+2+3+4...n의 합이  100을 넘는 최소의 n과 그때의 합을 출력하는 프로그램
		int n,s;
		n=0; s=0;
		while (s < 100) {
			n++;
			s=(n*(n+1))/2;
		}
		System.out.printf("최소의 n : %d\n", n);
		System.out.printf("합 : %d\n", s);		
	}
}