package ch04.unit1;

import java.util.Scanner;

public class IfEx05 {

	public static void main(String[] args) {
		//한문자를 입력 받아 대문자,소문자,숫자문자,기타문자인지 판별
		char c;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("한문자 ?");
		c=sc.next().charAt(0);
		
		if(c>='A'&&c<='Z') {
			s="대문자";
		}else if(c>='a'&&c<='z') {
			s="소문자";
		}else if(c>='0'&&c<='9') {
			s = "문자숫자";
		}else {
			s= "기타문자";
		}
		System.out.println(c + "->" + s);
		sc.close();
	}
}
