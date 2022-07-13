package ch04.unit1;

import java.util.Scanner;

public class OperatorEx04Quiz05 {

	public static void main(String[] args) {
		// 이름과 세과목 점수를 입력받아 합격여부를 판단
		Scanner sc = new Scanner(System.in);
		int a, b, c, aver;
		String name;
		System.out.println("이름? ");
		name = sc.next();

		System.out.println("세과목 점수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		aver = (a + b + c) / 3;
		if (a >= 40 && b >= 40 && c >= 40 && aver >= 60) {
			System.out.printf("%s 님은 합격입니다.", name);
		} else if (aver >= 60 /*&& !(a >= 40 && b >= 40 && c >= 40)*/) {
			// (a>=40 && b>=40 && c>=40)가 아닌경우는 위에서 이미 확인했다
			System.out.printf("%s 님은 과락입니다.", name);
		} else

		{
			System.out.printf("error");
		}
		sc.close();
	}

}
