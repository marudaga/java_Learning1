package ch02;

public class DataTypeEx07 {

	public static void main(String[] args) {
		int a, b;
		float n, m;
		double x, y;
		// float는 정밀도가 낮으므로 정밀도는 요구하는 경우에는 double를 사용한다.
		
		a = 2_000_000_000;
		b = 2_000_000_050;
		
		n = 2_000_000_000;
		m = 2_000_000_050;
		
		x = 2_000_000_000;
		y = 2_000_000_050;

		System.out.printf("int : %d, %d\n", a, b);
		   // 2000000000, 2000000050
		System.out.printf("float : %.2f, %.2f\n", n, m);
		   // 2000000000.00, 2000000000.00
		System.out.println(n == m);
		System.out.printf("double : %.2f, %.2f\n", x, y);
		   // 2000000000.00, 2000000050.00
	}

}
