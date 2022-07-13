package ch02;

import java.util.Scanner;

public class DataTypeEx05 {

	public static void main(String[] args) {
		/*
		 * 
		 -
		 실행예 정수 ? 15
		 8진수 : 017
		 16진수 : 0xF
		 */
		Scanner sc= new Scanner(System.in);
		int a;
		
		System.out.print("정수 ?");
		a= sc.nextInt();
		System.out.printf("8진수 : %#o\n",a);
		System.out.printf("16진수 : %#x\n",a);
		System.out.printf("8진수 : %o\n",a);
		System.out.printf("16진수 : %x\n",a);
		
		sc.close();
	}

}
