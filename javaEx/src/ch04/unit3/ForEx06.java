package ch04.unit3;

public class ForEx06 {

	public static void main(String[] args) {
		int s=0;
		int n=0;
		
		for(;;) {//for문의 조건식을 안쓰면  true가 됨
			n++;
			s+=n;
			if(n>=10) break;
		}
		System.out.println(s);
		
		System.out.println(s);
	}
}
