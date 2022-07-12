package ch03.unit3;

public class OperatorEx04 {

	public static void main(String[] args) {
		int a, b;
		a = 13;

		a=32;
		b=a>>3;//좌측에 부호로 채워짐
		System.out.println("32>>3: " + b);

		a=-32;
		b=a>>3;//shift연산자
		System.out.println("-32>>3: " + b);

		a=32;
		b=a>>>3;//논리 shift연산자 왼쪽 무조건 0
		System.out.println("-32>>>3: " + b);

	}

}
