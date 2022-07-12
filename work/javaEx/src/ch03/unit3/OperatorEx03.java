package ch03.unit3;

public class OperatorEx03 {

	public static void main(String[] args) {
		int a, b;
		a = 13;

		a = a ^ 20;
		System.out.println(a);// 25

		a = a ^ 20;
		System.out.println(a);// 13

		a = 17;
		b = 22;
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a +","+b);// 

	}

}
