package ch04.unit3;


public class ForEx05o {

	public static void main(String[] args) {
		//System.out.println(n); n  for문 내부라 외부로 나갈 수 없다.
//		int s,n;
//		for(n=1,s=0;n<=10;s+=n,n++)//(for(초기값(여러가지변수);bool;연산,수식)
//			;
//		System.out.println(s);
		//1~100까지의 홀수합
		int s=0;
		for(int i=1;i<=100;i+=2) {
			s+=i;
		}
		System.out.println(s);
		
	}
}
