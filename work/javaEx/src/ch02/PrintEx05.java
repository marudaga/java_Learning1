package ch02;

public class PrintEx05 {

	public static void main(String[] args) {
		/*
		 * printf("서식", 값, 값) : 서식에 따라 값을 출력. 출력 후 라인을 넘기지 않음
		 */
		int a, b, c;
		a = 10;
		b = 5;
		c = a + b;
		System.out.println(a + "+" + b + "=" + c);
		System.out.printf("%d + %d = %d\n", a,b,c);//%d는 정수
		System.out.format("%d + %d = %d\n", a,b,c);
		System.out.println();
		
		System.out.printf("%d + %d = %d\n", a,b,a+b);
		System.out.printf("%d - %d = %d\n", a,b,a-b);
		System.out.printf("%d * %d = %d\n", a,b,a*b);
		System.out.printf("%d / %d = %d\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", a,b,a%b);
	}
}
