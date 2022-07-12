package ch03.unit1;

import java.util.Scanner;

public class OreratorEx06my2 {

	public static void main(String[] args) {
		//금액 입력 화폐개수로 바뀌주는 프로그램
		System.out.println("금액 ?");
		int money;
		Scanner sc= new Scanner(System.in);
		money =sc.nextInt();
		

		System.out.println("오만원권 : "+money/50000);
		System.out.println("만원 : "+money/10000%5);// %50000/10000
		System.out.println("오천원권 : "+money/5000%2);//%10000/5000
		System.out.println("천원권 : "+money/1000%5);
		System.out.println("오백원권 : "+money/500%2);
		System.out.println("백원권 : "+money/100%5);
		System.out.println("오십원권 : "+money/50%2);
		System.out.println("오원권 : "+money/5%5);//%10/5
		System.out.println("일원권 : "+money%5);
		sc.close();
	}
}
