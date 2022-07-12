package ch02;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first, second;
		System.out.println("숫자를 두가지 입력하시오\n : ");
		first = sc.nextInt();
		second = sc.nextInt();
		
		System.out.printf("%d %d = %d\n",first,second,first+second);
		sc.close();
	}
}
