package ch04.unit3;

import java.util.Scanner;

public class ForQuiz02 {

	public static void main(String[] args) {
		int n,s=0;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print(" 수 ? ");
			n=sc.nextInt();
		}while(n<1||n>1000);
		//조건 만족할 때까지 반복->첫조건이 맞지 않을 때 
		for(int i=0;i<=n;i++) {
			s+=i;
		}
		System.out.printf("1~20까지 합:%d ",s);
		sc.close();
	}
}
