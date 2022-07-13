package ch03.unit1;

import java.util.Scanner;

public class OreratorEx06hw1o {
//03-0101 산술연산자 4번
	public static void main(String[] args) {
		// 섭씨온도를 입력받아 화씨온도로 변환
		Scanner sc = new Scanner(System.in);
		int celc;
		System.out.print("섭씨 온도 ?  ");
		celc = sc.nextInt();
		double fa;
		fa = celc * 1.8 + 32;
		System.out.printf("화씨온도 : %.1f", fa);
		sc.close();
	}

}
