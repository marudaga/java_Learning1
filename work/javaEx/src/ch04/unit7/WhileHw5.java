package ch04.unit7;

import java.util.Scanner;

public class WhileHw5 {

	public static void main(String[] args) {
		// 금액을 입력받아 5만원권만원권 오천원 천원 오백백 오십 십 오 일 권으로 나눈다.
		Scanner sc = new Scanner("System.in");

		int a,b;
		System.out.print("금액 ? ");
		a = sc.nextInt();
		int unit = 50000;
		boolean sw = true;

		while (true) {
			b = a/unit;
			System.out.println(unit + "원권 :" + b+ "개");

			if (unit == 1) {
				break;
			}
			a=a-b*unit;
			if (sw) {
				unit /= 5;
				sw = false;
			} else {
				unit /= 2;
				sw = true;
			}
		}
		sc.close();
	}
}