package ch04.unit1;

import java.util.Scanner;

public class IfEx06 {

	public static void main(String[] args) {
		//정수를 입력받아 3과 4의 배수인지,3의배수인지,4의배수인지 판별
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수");
		n= sc.nextInt();
		
		if(n%3==0&& n%4==0) {
			System.out.println(n+" : 3과 4의 배수");
		}else if(n%3==0) {
			System.out.println(n+ " : 3의 배수");
		}else if (n%4==0) {
			System.out.println(n+" : 4의 배수");
		}else {
			System.out.print(n+"3 또는 4의 배수가 아님");
		}
		sc.close();
	}
}