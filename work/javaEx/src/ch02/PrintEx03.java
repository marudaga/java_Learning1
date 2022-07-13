package ch02;

public class PrintEx03 {
	public static void main(String[] args) {
		/*
		 * 문자열 + 숫자
		 */

		System.out.println("국어" + 80 + "\t\t영어:" + 70);
		System.out.println(80 + 90 + "\n" + 100 + 70);
		// \n오른쪽과 묶인다.
		System.out.print(100 + "\t");
		System.out.print(70 + "\t");
		System.out.print(90 + "\t");

		System.out.println("자바\t");
		System.out.println("HTML");
		// println 찍고 라인 넘긴다.(커서가 다음줄에 찍힘)
	}
}
