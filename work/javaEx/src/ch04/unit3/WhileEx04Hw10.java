package ch04.unit3;

//반복문while20기본문제10
public class WhileEx04Hw10 {

	public static void main(String[] args) {
		// 구구단 2단부터 9단까지 출력
		int a,b,re;
		a=2;b=1;
		while(b<=9)	{
			while(a<=9) {
				re=a*b;
				System.out.printf("%d*%d= %d ",a,b,re);
				a++;
			}
			System.out.println();
			b++;
			a=2;
		}
	}
}