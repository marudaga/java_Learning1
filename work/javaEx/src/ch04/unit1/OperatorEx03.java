package ch04.unit1;

import java.util.Scanner;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;
		String s;
		
		System.out.print("년도  ? ");
		year= sc.nextInt();

		if(year%4==0&&year%100!=0|| year%400==0) {
			s = "윤년";
		}else 
		{ s="평년";}
		System.out.print(s);
		sc.close();
	}
}