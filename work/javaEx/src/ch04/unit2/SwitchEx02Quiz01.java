package ch04.unit2;

import java.util.Scanner;
//switch(변수 나 수식) case 다음에는 리터널 혹은 상수만 가능 break로 case 닫아야함 (아니면 전부실행됨), 마지막 break는생략가능
public class SwitchEx02Quiz01 {

	public static void main(String[] args) {
		//
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("점수 ? ");
		n=sc.nextInt();
				System.out.printf("점수 : %d ",n," 판정: ");
		switch((int)(n/10)%10) {
		//byte/char= int byte char short 는 자동으로 int로 계산 
		// 정수/정수는 정수 정수/실수 =실수 char/int = int 
		case 10:
		case 9: System.out.print("『수』");break;
		case 8: System.out.print("『우』");break;
		case 7: System.out.print("『미』");break;
		case 5: System.out.print("『양』");break;
		case 4: case 3: case 2: case 1: case 0:System.out.print("『가』");
		sc.close();
		}
	}
}