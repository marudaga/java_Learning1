package ch04.unit7;

import java.util.Scanner;

public class WhileHw8 {

	public static void main(String[] args) {
		// 양의 정수를 입력받아 뒤집어 출력 
		//규칙찾기=> while이니까 조건과 규칙을 찾아=> 나열해보는거야 =>관계식
		Scanner sc= new Scanner(System.in);
		int n1,n2,temp;
		
		do {
			System.out.print("양수 ? ");
			n1 =sc.nextInt();
		}while(n1<=0);
		
		n2=0;
		temp=n1;
		//n1, n2,temp 12345 12345
		
		while(temp>0) {
		n2*=10;
		n2+=temp%10;
		temp/=10;
		//1234%10=>4
		//1234/10=123
		
		//123%10=3
		//123/10=12
		}
		System.out.println("원래의 수:" +n1);
		System.out.println("뒤집은 수:" +n2);
		sc.close();
	}
}