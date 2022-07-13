package ch04.unit6;

import java.util.Scanner;

public class ReturnEx01o {

	public static void main(String[] args) {
		// 1~ 100까지 수 중에서 3또는 4의 배수를 제외한 수를 한 줄에 5개씩 출력
		
		Scanner sc = new Scanner(System.in);
		
		int n,s;
		System.out.print("수 ?");
		n=sc.nextInt();
		if(n<1) {
			System.out.println("1이상의 수를 입력 해야 합나다.");
			sc.close();
			return;//main을 나감
		}
		 s=0;
		 for(int i=1; i<=n; i++) {
			 s+=i;
		 }
		 System.out.println("1~" +n+ "까지 합 : " + s);
		 sc.close();
	}
}