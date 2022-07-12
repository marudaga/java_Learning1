package ch04.unit3;

import java.util.Scanner;

public class rockscissorpaper {

	public static void main(String[] args) {
		// 가위바위보 게임
		Scanner sc = new Scanner(System.in);

		int user, com;

		while (true) {
			do {
				System.out.println("1.가위 2.바위 3.보 4. 종료 => ");
				user = sc.nextInt();
			} while (user < 1 || user > 4);
			// 무승부,1<2,2<3,3<1
			com = (int) (Math.random() * 3) + 1;// 1~3 난수
			
			if	 (user == 4) break;
			else if(user==com) {
				// else if(user==com&&user!=4)=> user!=4 위에서 이미 경우 제외됨
				System.out.println("유저 vs 컴퓨터 : 무승부");
			}else if((user==1&&com==2)||(user==2&&com==3)||(user==3&&com==1))//
			{
				System.out.println("유저 vs컴퓨터 : 컴퓨터승");
			}else {
				System.out.println("유저 vs컴퓨터 :  유저승");
			}
				
			System.out.println("유저:" +(user ==1?"가위" :(user==2?"바위":"보")));
			System.out.println("컴퓨터:" +(user ==2?"바위" :(com==1?"바위":"보")));
		}
		sc.close();
	}

}
