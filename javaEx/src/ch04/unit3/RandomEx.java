package ch04.unit3;


public class RandomEx {

	public static void main(String[] args) {
		//Math library
//			Math.random()  : 0<=난수<1(실수) =>1 포함안됨!
		//1~100사이의 난수를 100개 발생시켜 한줄에 10개씩 출력
		int n;
		int cnt;
		
		cnt=0;
		while(cnt<100) {
			cnt++;
			n=(int)(Math.random() * 100) + 1;
			System.out.printf("%d", n);
			if(cnt%10 ==0) {
				System.out.println();
			}
		}
		 
	}

}
