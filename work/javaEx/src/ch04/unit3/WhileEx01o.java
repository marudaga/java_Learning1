package ch04.unit3;

import java.util.Scanner;
//switch(변수 나 수식) case 다음에는 리터널 혹은 상수만 가능 break로 case 닫아야함 (아니면 전부실행됨), 마지막 break는생략가능
public class WhileEx01o {

	public static void main(String[] args) {
		//
		Scanner sc= new Scanner(System.in);
		String s;
		//string(x)=> String(o)  대문자
		System.out.print("문자열[j1,j2, j3] ?");
		s=sc.next();
		
		switch(s) {
		case "3": System.out.print("***");break;
		case "2":	System.out.print("**");break;
		case "1":	System.out.print("*");break;
		default : System.out.println("입력 에러 입니다.");break;
		//case1에 break없어서  case1,2인 경우 둘다 실행됨
		//default는 없는 경우에 해당
		//문자열비교 if(s=="j1") 잘못된 코딩 문자열은 ==으로 비교불가=>문자열의 주소 비교
		//case도 switch 변수가 string이면 그에 맞는 type사용
		}
		sc.close();
	}
}