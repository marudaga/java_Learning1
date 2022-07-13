package ch03.unit1;

import java.util.Scanner;

public class OreratorEx06my {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,hour,min,sec;
		System.out.println("초를 입력하세요 ?");
		a=sc.nextInt();
		hour=a/3600;
		min=(a/60)%60;
		//%3600/60 이랑 같다.
		sec=(a)%60;

		System.out.printf("%d시 %d분%d초",hour,min,sec);
		sc.close();
	}

}
