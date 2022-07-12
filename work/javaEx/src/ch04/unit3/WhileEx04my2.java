package ch04.unit3;

public class WhileEx04my2 {

	public static void main(String[] args) {
		//1*2*3*4*..10의 결과 출력
		int n,s;
		n=1; s=1;
		while(n<=10) {
			s *=n;
			n++;
			// n++를 나중에 넣어서 초기값이 연산되도록함
		}
		System.out.println(s);
		
	}
}