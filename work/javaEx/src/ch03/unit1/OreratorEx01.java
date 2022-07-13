package ch03.unit1;

import java.util.Scanner;

public class OreratorEx01 {

	public static void main(String[] args) {
		// 산술연산자

		// 두수를 입력받아 사칙연산과 나머지 구하기
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.print("두수 ?");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.printf("%d +%d = %d\t", a, b, a + b);
		System.out.printf("%d -%d = %d\n", a, b, a - b);
		System.out.printf("%d *%d = %d\t", a, b, a * b);
		System.out.printf("%d /%d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b);
		sc.close();
	}

}
