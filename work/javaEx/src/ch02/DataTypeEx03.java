package ch02;

public class DataTypeEx03 {

	public static void main(String[] args) {
		
		short a,b = 100;
		int x=100;
		a=(short)x;
		System.out.println(a+","+b+","+x);
		
		long n;
		
		n=x;// 자료형 변환시 큰 자료형으로 변환된다.
		System.out.println(n);
		
		n=2200000000L;
		//리터럴인22억은 int형이라 형변환해야함.
	}
}
