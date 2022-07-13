package ch04.unit5;

import java.util.Scanner;

public class WhileHw3 {

	public static void main(String[] args) {
		// 1~ 100까지 수 중에서 3또는 4의 배수를 제외한 수를 한 줄에 5개씩 출력
		Scanner sc = new Scanner(System.in);
		int a,b,temp,temp2,input1,input2;

		System.out.print("두수 ?");
		a = sc.nextInt();
		b = sc.nextInt();
		input1=a;
		input2=b;
		
		while(true) {
			if(a<b) {
				temp=a;
				a=b;
				b=temp;
			}
			if(a%b!=0) {
				temp=a%b;
				a=b;
				b=temp;
			}
		}
		temp2 = (input1*input2)/temp;
		
		
		System.out.printf("GCD(최대공약수) : ", temp);
		System.out.printf("LCM(최소공배수) :", temp2);
		sc.close();
	}
}