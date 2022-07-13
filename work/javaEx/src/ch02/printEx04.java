package ch02;

public class printEx04 {

	public static void main(String[] args) {
		int kor = 100, eng = 90, mat = 90;
		int tot;

		tot = kor + eng + mat;

		System.out.println("국어 영어 수학 총점");
		System.out.println(kor + " " + eng + " " + mat + " " + tot);
		// " "없으면 값을 더해버림 , int+int 더함, int +string 각각표현
		System.out.println(kor + eng + mat + tot);
		System.out.println("국어 영어 수학 총점");
		System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot);
		//커서( 깜빡이는 것):캐럿 커서: 마우스 움직이는 것
	}
}
