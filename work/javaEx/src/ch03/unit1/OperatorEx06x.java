package ch03.unit1;

import java.util.Scanner;

public class OperatorEx06x {

	public static void main(String[] args) {
		/*
		 * 반지름을 입력받아 원의 넓이와 둘레 계산하기
		 *  넓이: 반*반*3.14 
		 *  둘레:반*2*3.14
		 */
		Scanner sc =new Scanner(System.in);
		
		int r;
		double a,b;
		
		System.out.print("반지름? ");
		r= sc.nextInt();
		
		a=r*r*3.141592;
		b=r*2*3.141592;
		
		System.out.println("넓이:"+a+", 둘레: "+b );
		
		sc.close();
	}

}
