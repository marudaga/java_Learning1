package ch02;

import java.util.Scanner;

public class DataTypeEx09 {

	/*
	 -정수를 ASCII코드로 변경출력*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하시오");
		int a = sc.nextInt();
		System.out.printf("%1$d ->%1$c", a);
		sc.close();
	}
	//아스키코드표에 따라 정수는 문자로 문자는 정수로 변형
	
}
