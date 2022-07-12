package ch04.unit3;

//반복문while20기본문제4
public class WhileEx04Hw04 {

	public static void main(String[] args) {
		// 1~ 100 수 중에서 3또는 5의 배수 합과 평균
		int i = 0, s=0, av, cnt = 0;
		while (i < 100) {
			i++;
			if (i % 3 == 0 || i % 5 == 0) {
				cnt++;
				s += i;
			}
		}
		av=s/cnt;
		System.out.printf("함  : %d\n", s);
		System.out.printf("평균  : %d\n", av);
	}
}