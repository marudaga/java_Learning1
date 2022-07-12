package ch04.unit2;

import java.util.Scanner;
//switch(변수 나 수식) case 다음에는 리터널 혹은 상수만 가능 break로 case 닫아야함 (아니면 전부실행됨), 마지막 break는생략가능
public class SwitchEx01o {

	public static void main(String[] args) {
		//
		Scanner sc= new Scanner(System.in);
		int n;
		
		System.out.print("수 ?");
		n=sc.nextInt();
		
		switch(n%3) {
		case 0: System.out.print("3의배수");break;
		case 1:
		case 2:	System.out.print("3의 배수아님");break;
		//case1에 break없어서  case1,2인 경우 둘다 실행됨
		}
		sc.close();
		
	}
}