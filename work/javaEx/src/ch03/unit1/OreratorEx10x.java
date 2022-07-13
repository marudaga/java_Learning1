package ch03.unit1;

public class OreratorEx10x {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=a++ + a++ +1;
		System.out.println(a +","+b);

		a=10;
		b=a++ + ++a +1;
		System.out.println(a +","+b);

		a=10;
		b=a++ + ++a + ++a + a++;
		System.out.println(a +","+b);

		a=0;
		b=a---a;
		System.out.println(a +","+b);
	}

}
