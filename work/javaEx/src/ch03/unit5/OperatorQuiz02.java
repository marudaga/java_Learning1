package ch03.unit5;

import java.util.Scanner;

public class OperatorQuiz02 {
		public static void main(String[] args) {
			
		//년도를 입력받아 년도가 윤년인지 평년인지 판별하는 프로그램
		Scanner sc = new Scanner(System.in);
		int year;
		String yearName;

		System.out.print("년도  ? ");
		year = sc.nextInt();
		yearName = (year%4==0&&year%100!=0|| year%400==0)?"윤년":"평년";

		
		
		System.out.println(year +  "년 : " + yearName);
		sc.close();
		}
}
