package ch02;

import java.util.Scanner;

public class DataTypeEx08 {

	public static void main(String[] args) {
		char c1 = 'A',c2;
		c2='\u0041';
		
		System.out.println(c1 + "," + c2);
		//char형 빈형태는 error,단어error
		
		c1 = '대';
		System.out.println(c1);
		
		int a =c1;//char을 int형으로 -> int크기가 더 커서 가능, int형이 된다.
		System.out.println(a);//유니코드 값
		
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("한문자 ? ");
		ch = sc.next().charAt(0) ;
		
		int b = ch;
		System.out.printf("%c 의 아스키코드는 %d\n", ch,b);
		
		
		sc.close();
	}
}
