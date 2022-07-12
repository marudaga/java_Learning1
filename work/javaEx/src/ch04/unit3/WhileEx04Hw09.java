package ch04.unit3;

//반복문while20기본문제8
public class WhileEx04Hw09 {

	public static void main(String[] args) {
		// 피보나치수열 합 구하는 프로그램 1+1+2+3+5+8+13+21
		int a,b,c,i,sum;
		a=0;b=1;c=0;i=1;sum=1;
		
		while(i>=1&&i<=7)	{
			c=a+b;
			a=b;
			b=c;
			i++;
			sum+=c;
		}
		System.out.printf("결과  : %d",sum);
	}
}