package ch04.unit1;

import java.util.Scanner;

public class OperatorEx04Quiz06o {

	public static void main(String[] args) {
		// 중간40기말40 출석10 레포트10 합산점수 학점
		Scanner sc = new Scanner(System.in);
		int mid, fin, rep, abs, repScore = 0;
		double total;
		char grade='0';
		String num, name;
		System.out.println("학번 ? ");
		num = sc.next();
		System.out.println("이름 ? ");
		name = sc.next();
		System.out.println("중간고사 점수 ? ");
		mid = sc.nextInt();
		System.out.println("기말고사 점수 ? ");
		fin = sc.nextInt();
		System.out.println("결석횟수 ? ");
		abs = sc.nextInt();
		System.out.println("레포트 점수 ? ");
		rep = sc.nextInt();
		if (rep == 0 || rep == 1)
			repScore = 100;
		else if (rep == 2 || rep == 3)
			repScore = 80;
		else if (rep == 4 || rep == 5)
			repScore = 60;
		else if (rep > 6)
			repScore = 0;
		else
			System.out.println("error");
		// 이것도 젤큰 범위 if 그 다음 범위 순으로 설정한 수 있다.
		total = (int) (mid * 0.4 + fin * 0.4 + abs * 0.1 + repScore * 0.1);
		//안된다? 각각 잡아서 
		if (total <= 100 && total >= 0) {
			if (total >= 90) {
				grade = 'A';
			} else if (total >= 80) {
				grade = 'B';

			} else if (total >= 70) {
				grade = 'C';

			} else if (total >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}
		System.out.println("학번\t이름\t중간고사\t기말고사\t출석점수\t레포트\t합산점수\t학점");
		// /t가 아니라 \t로 넣기
		System.out.printf("%s \t 1%s\t%d\t%d\t%d\t%d\t %.1f\t%c", num, name, mid, fin, abs, repScore, total, grade);
		sc.close();
	}
}