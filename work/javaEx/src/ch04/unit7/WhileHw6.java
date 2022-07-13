package ch04.unit7;

import java.util.Scanner;

public class WhileHw6 {

	public static void main(String[] args) {
		// 1~100 사이의 난수 발생시켜 맞추는 게임
		Scanner sc= new Scanner(System.in);
		int cnt;
		int user,com;
		
		com = (int)(Math.random()*100) +1;
		
		cnt =0;
		
		do {
			System.out.print("수 ?");
			user = sc.nextInt();
			cnt++;
			if(user>com) {
				System.out.println("입력한 수보다 적은 수이다");
			}else if(user<com) {
				System.out.println("입력한 수보다 큰 수이다.");
			}
		}while(com !=user);
		System.out.println(cnt+ "번 만에 성공...");
		
		sc.close();
	}
}