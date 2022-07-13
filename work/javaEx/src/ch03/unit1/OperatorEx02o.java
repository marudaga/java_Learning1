package ch03.unit1;

/*
-	자바는 정수에 대한 연산의 기본 타입은 int
-	+%연산의 피연산자가 byte,char,short인 경우 컴퓨터가 int로 변환연산하여 int로 결과 나옴*/
public class OperatorEx02o {

	public static void main(String[] args) {
		byte a,b;
		long c;
		a=100;
		b=120;
		c=(a+b);
		System.out.println(c);
		
		short s1=100,s2=200,s3;
		s3=(short)(s1+s2);
		System.out.println(s3);
		char c1 = 'A', c2 = 10, c3;
		//c3 = char(c1+c2);
		c3=(char)(c1+c2);
		// char(c1+c2) error 문법오류
		System.out.println(c3);
	
		int x;
		x= 0b101 + 20;
		System.out.println(x);
	}
}
