package ch04.unit3;

public class ForEx02 {

	public static void main(String[] args) {
		// for 문과 while 문 비교
		int n, s;
		n = 0;
		s = 0;
		while (n < 10) {
			n++;
			s += n;
		}
		System.out.println("결과:" + s);
		s=0;
		for(n=1;n<=10;n++) {
			s+=n;

		}
		System.out.println("결과:" + s);
	}

}
