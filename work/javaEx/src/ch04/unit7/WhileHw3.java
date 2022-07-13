package ch04.unit7;

import java.util.Scanner;

public class WhileHw3 {

	public static void main(String[] args) {
		// 1~ 100까지 수 중에서 3또는 4의 배수를 제외한 수를 한 줄에 5개씩 출력
		Scanner sc = new Scanner(System.in);
		int n1,n2,a,b,mod,c;
		mod=0;
		System.out.print("두수 ?");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		a=n1;
		b=n2;
		
		while(mod>0) {
			a=b;
			b=mod;
			mod= a%b;
		}
		
		c=(n1*n2)/mod;

		System.out.printf("GCD(최대공약수) : ", b);
		System.out.printf("LCM(최소공배수) :", c);
		sc.close();
//			if(a<b) {
//				temp=a;
//				a=b;
//				b=temp;
//			}
//			if(a%b!=0) {
//				temp=a%b;
//				a=b;
//				b=temp;
//			}
//			temp2 = (input1*input2)/temp;
//		}
//		
//		System.out.printf("GCD(최대공약수) : ", temp);
//		System.out.printf("LCM(최소공배수) :", temp2);
		sc.close();
	}
}