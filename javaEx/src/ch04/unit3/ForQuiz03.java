package ch04.unit3;

import java.util.Scanner;

//기본5번
public class ForQuiz03 {
//10개의 정수를 입력받아 입력받은 정수 중 가장 큰 값 출력
	public static void main(String[] args) {
//		int n,max=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("10개의 정수를 입력 하세요...");
		
//		1st	
//		for(int i=0;i<10;i++) {
//			n=sc.nextInt();
//			if(max<n) {
//				max=n;// 정수 최대값: 4bit=>2e+32   signed bit=>  0x7FFFFFFF  최소값 0xF
//			}
//		}

//2nd
//		for(int i=0;i<10;i++) {
//			n=sc.nextInt();
//			if(i==0||max<n) {
//				max=n;
//			}
//		}
//		System.out.println(max);
		
		//my
		int a, b, big=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 정수를 입력 하세요...");
		for (int i = 0; i < 5; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a >= b) {
				if(big>a);
				else if(big<=a) {
					big = a;					
				}
			} else {
				if(big>b);
				else {
					big = b;
				}
			}
		}
		System.out.print(big);
		
		
		
		sc.close();
	}
}
