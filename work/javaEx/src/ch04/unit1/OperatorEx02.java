package ch04.unit1;

import java.util.Scanner;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		n= sc.nextInt();
		
		String s="홀수가 아님";
		if((n&1) ==1) {
			s="홀수";
		}
		System.out.println(n+":" + s);
		System.out.println(n+":" + s);
		sc.close();
	}

}
