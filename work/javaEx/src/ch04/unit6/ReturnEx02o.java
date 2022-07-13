package ch04.unit6;

import java.util.Scanner;

public class ReturnEx02o {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int ch;
		int n, s = 0;
		int start, step;

		while (true) {
			do {
				System.out.print("1.합 2.짝수합 3.홀수합 4.종료 => ");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 4);

			if (ch == 4) {
				sc.close();
				return;
			}

			System.out.print("원하는 수 ?");
			n = sc.nextInt();
			if (ch == 1) {
				start = 1;
				step = 1;
			} else if (ch == 2) {
				start = 2;
				step = 2;
			} else {
				start = 1;
				step = 2;
			}
			for (int i = start; i <= n; i += step) {
				s += i;
			}
			System.out.println("결과 :" + s);
		}
	}
}
//		// 1~ 100까지 수 중에서 3또는 4의 배수를 제외한 수를 한 줄에 5개씩 출력
//		
//		Scanner sc = new Scanner(System.in);
//		int ch;
//		int n,s=0,odds=0,evens=0;
//		
//		while(true) {
//			do {
//				System.out.print("1.합 2.짝수합 3.홀수합 4.종료 => ");
//				ch = sc.nextInt();
//			}while(ch<1||ch>4);
//			
//			if(ch ==4) {
//				sc.close();
//				return;
//			}
//			do {
//				System.out.print("원하는 수 ?");
//				n= sc.nextInt();
//				switch(ch) {
//				case 1: s+=n;
//				case 2:if(n%2==0) {evens+=n;}
//				case 3:if(n%2!=0) {odds+=n;}
//				}
//			}while(n<1);
//			System.out.println("");

