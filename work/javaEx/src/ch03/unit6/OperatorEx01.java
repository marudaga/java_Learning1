package ch03.unit6;

public class OperatorEx01 {

	public static void main(String[] args) {
		//typecasting 강제형변환
		
		short a;
		byte b;
		char c;
		int d;
		long e;
		
		a=10;
		
		b=(byte)a; //typecasting 강제형변환

		System.out.println(b);
		
		c = 'A';
		d=c+10;
		System.out.println(d);

		d=123456789;
		e=d*d;//형변환 안한경우 이상한 값나옴
		System.out.println(e);

		e=(long)d*d;
		System.out.println(e);

	}

}
