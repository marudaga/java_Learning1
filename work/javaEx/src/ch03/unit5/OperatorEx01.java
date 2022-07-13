package ch03.unit5;

import java.util.Scanner;

public class OperatorEx01 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a,b;
			System.out.println("정수 ? ");
			a= sc.nextInt();
			
			b=a>0 ? a:-a;// 조건? 초기값/변화
			
			System.out.println(a+"->" +b);
			
			sc.close();
			
		}
}
