package ch04.unit7;

import java.util.Scanner;

public class WhileHw7 {

	public static void main(String[] args) {
		// 2이상의 정수를 입력 받아 소수하여 출력
		Scanner sc= new Scanner(System.in);
		int num,n;
		num=sc.nextInt();
		
		boolean b=true;
		n=2;
		while(n<num) {
			if(num%n==0) {
				b=false;
				break;
			}
			n++;			
		}
		if(b&&num!=1) {
			System.out.println(num+" : 소수");
		}else {
			System.out.println(num+ ": 소수가 아님");
		}
		sc.close();
	}
}
//n%i
//n>=2
//i=1
//i++;
//n%i==0 최초의 소수
//=> 
//n=n/i
//i가 n이면
//n%i==0 루프종료