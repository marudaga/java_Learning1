package ch04.unit3;

import java.util.Scanner;

public class DoWhileEx02o {

	public static void main(String[] args) {
		// 1~- 사이의 수를 입력 받아 입력 받은 수의 구구단 구하기
		//단, 입력받은 수가 1~ 0 이외의 수이면 다시 입력 받는다.
		 Scanner  sc= new Scanner(System.in);
		 int dan;
		 int n;
		 //do를 반복실행하는 경우+ 첫번째 실행이 while의 조건이 아닐 때 
		 // 입력받은 것 검증할 때
		 do{
			 System.out.print("단[1~9] ? ");
			 dan = sc.nextInt();
		 }while(dan<1||dan> 9);
		 
		 n=0;
		 while(n<9) {
			 n++;
			 System.out.printf("%d *%d = %d\n ", dan,n,dan*n);
		 }
		 sc.close();
		 
	}

}
