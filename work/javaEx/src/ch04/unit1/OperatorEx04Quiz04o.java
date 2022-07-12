package ch04.unit1;

import java.util.Scanner;

public class OperatorEx04Quiz04o {

	public static void main(String[] args) {
		//두수 및 연산자를 입력받아 입력받은 연산자에 대한 연산을 수행하는 프로그램을 작성
		Scanner sc= new Scanner(System.in);
		int x,y,ans,oper;
		System.out.println("두 수 ? ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("연산자[+,-,*,/] ?");
		oper=sc.next().charAt(0);
		
		
		if(oper =='+')
		{
			ans=x+y;
			System.out.printf("%d + %d =%d", x,y,ans);
			//'y'는 문자(char) =>23 아스키 코드값나옴 "y"는 string y출력
			//System.out.println("x" + "y"+  "=" + ans);
		}else if(oper =='-' ){
			ans=x-y;
			System.out.printf("%d - %d =%d", x,y,ans);
		}
		else if(oper =='*')
		{
			ans=x*y;
			System.out.printf("%d * %d =%d", x,y,ans);

		}
		else if(oper =='/') {
			ans=x/y;
			System.out.printf("%d / %d =%d", x,y,ans);
			//마지막은 else로 끝나야함 아니면 error 가능성있음
			//System.out.println("x" + "y"+  "=" + ans);
		}
		sc.close();
	}

}
