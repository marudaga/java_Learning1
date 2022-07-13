package ch02;

public class EscapeEx01 {

	public static void main(String[] args) {
		// 확장열
		System.out.println("A\tB\tC");
		System.out.println("A\nB\nC");

		System.out.println("1 \\ 2");// 자체출력
		System.out.println(" \"서울\" ");// 기호출력 \기호

		System.out.println('\101'); // 홋따옴표안에 /숫자 8진수 유니코드
		String a="l01";
		System.out.println(a);
		System.out.println('\u0043');// 16진수 유니코드

	}

}
