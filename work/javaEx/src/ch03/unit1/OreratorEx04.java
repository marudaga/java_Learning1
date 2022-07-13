package ch03.unit1;

public class OreratorEx04 {

	public static void main(String[] args) {
		int a = 3, b = 2;
		double c;

		c = a / b + a / b;
		System.out.println(c);

		c = (double) (a / b) + a / b;
		System.out.println(c);//2.0

		c = (double) a / b + a / b;
		System.out.println(c);// 3.0

		c = (double) a / b + (double) a / b;// 1.5+1.5
		System.out.println(c);//

		c = 'A' / 10.;
		System.out.println(c);// 6.5

		c = 3.7 % 1.3;
		System.out.println(c);//1.1

		c= 'A' +10;
		System.out.println(c);//75.0
	}
}
