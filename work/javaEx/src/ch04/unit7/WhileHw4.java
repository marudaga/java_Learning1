package ch04.unit7;

import java.util.Scanner;

public class WhileHw4 {

	public static void main(String[] args) {
		// 개수를 입력받아피보나치 0부터 입력 받은 개수만큼 출력
		Scanner sc= new Scanner("System.in");
		int a,b,c,n;
		int cnt;
		
		System.out.print("개수 ? ");
		cnt = sc.nextInt();
		
		a=0;
		b=1;
		n=0;
		while(n<cnt) {
			System.out.print(a+ "  ");
			c=a+b;
			a=b;
			b=c;
			n++;
		}
		System.out.println();
		
		sc.close();
	}
}