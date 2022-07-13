package ch04.unit3;

//누적합 s+=n;검증이 필요하다=>
public class WhileEx03o {

	public static void main(String[] args) {
		int n,s;
//		n=-1;s=0;
//		while(n<100) {
//			n+=2;
//			s += n;
//			// 1부터 101까지 합이됨 11번째줄과 12번째줄을 바꾸면됨
//		}
		// n%2=1로 실행량많고,속도감소
		n=1;s=0;
		while(n<100) {
		s += n;
		n+=2;
		}
		System.out.println("결과 :" +s);
	}
}