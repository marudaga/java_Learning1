package ch03.unit1;

import java.util.Scanner;

public class OreratorEx05 {

	public static void main(String[] args) {
		/*
		 * 가로와 세로 길이를 입력 받아 직사각형의 넒이 둘레 계산하기 
		 * 넓이 = 가*세 
		 * 둘레 = (가+세)*2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int c,d;
		
		System.out.print("가로  ?");
		a= sc.nextInt();
		System.out.print("세로  ?");
		b= sc.nextInt();
		
		c= a * b;
		d= (a+b)*2;
		
		System.out.println("넓이: "+c);
		System.out.println("둘레: "+d);
		
		sc.close();
		
		
	}

}
