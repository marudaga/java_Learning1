package ch04.unit7;

import java.util.Scanner;

public class WhileHw2 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
//		int n, n2, i;
//
//		System.out.print("수 ?");
//		n = sc.nextInt();
//		n2 = n;
//		i = 1;
//
//		do {
//			if (n < 0)
//				n -= 0;
//			if (n > 10) {
//				i++;
//				n = n / 10;
//			}// n2를 설정해서 n2를 기존값 저장하고 n1을 변경한것=>temp를 이용하여 변경된 값을 temp에 저장
//		} while (n > 10 || n < -10);
//		
//		System.out.printf("%d은 %d자리 정수", n2, i);
//		sc.close();
		int n, len, temp;
		
		System.out.print("정수 ?" );
		n=sc.nextInt();
		len = 1;
		temp = n>=0? n:-n;
		while(temp>=10) {
			temp/=10;
			len++;
		}

		System.out.printf("%d은 %d자리 정수",n,len);
		sc.close();
	}
}