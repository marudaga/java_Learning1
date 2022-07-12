package ch04.unit1;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		//3개의 숫자를 입력받아 적은 수에서 큰 수 순으로 출력
		Scanner sc = new Scanner(System.in);
		int a,b,c,temp;
		System.out.print("세수 입력? ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b) {
			temp=a; a=b; b=temp;
		}
		if(a>c) {
			temp=a; a=c;c=temp;
		}
		if(b>c) {
			temp=b; b=c; c=temp;
		}
		System.out.println(a+","+b+","+c);
		sc.close();
	}
}
