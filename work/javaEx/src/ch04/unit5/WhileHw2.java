package ch04.unit5;

import java.util.Scanner;

public class WhileHw2 {

	public static void main(String[] args) {
		// 1~ 100까지 수 중에서 3또는 4의 배수를 제외한 수를 한 줄에 5개씩 출력
		Scanner sc = new Scanner(System.in);
		int n, n2, i;

		System.out.print("수 ?");
		n = sc.nextInt();
		n2 = n;
		i = 1;

		do {
			if (n < 0)
				n -= 0;
			if (n > 10) {
				i++;
				n = n / 10;
			}
		} while (n > 10 || n < -10);

		System.out.printf("%d은 %d자리 정수", n2, i);
		sc.close();
	}
}