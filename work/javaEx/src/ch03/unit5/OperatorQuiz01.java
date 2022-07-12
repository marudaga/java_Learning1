package ch03.unit5;

import java.util.Scanner;

public class OperatorQuiz01 {
		public static void main(String[] args) {
			
		//문자입력받아 대문자 -> 소문자 ,소문자-> 대문자, 기타문자는 그대로 출력
		Scanner sc = new Scanner(System.in);
		char c1,c2;
		
		System.out.print("한문자  ? ");
		c1= sc.next().charAt(0);//next()는 문자열, charAt(0)문자index 값중 0번째만 받음
		
		c2 = c1>='A'&&c1<='Z' ? (char)(c1+32):(c1>='a'&&c1<='z'? (char)(c1-32):c1);
		
		System.out.println(c1 + "->" +c2);
		sc.close();
			
		}
}
