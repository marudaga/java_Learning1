package ch03.unit1;

public class OreratorEx03 {

	public static void main(String[] args) {
		int a;
		a=3/2+1/2+2/3;//정수 연산자 정수 -> 정수 (버림) 1+0+0
		System.out.println(a);
		
		double b;
		b =3/2+1/2+2/3;// 1+0+0
		System.out.println(b);
		//실수 연산자 정수 =>실수
		//정수 연산자 실수 =>실수
		b =(double)(3/2.+1/2+2/3);//실수+정수=>실수1.5+0+0 
		System.out.println(b);
	}
}
