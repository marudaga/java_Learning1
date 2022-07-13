package ch02;

public class PrintEx07 {

	public static void main(String[] args) {
		System.out.printf("%f\n", 123.23);//
		System.out.println(123.23);
		System.out.printf("%.2f\n", 123.23);// %십의자리.소수점자리수f 정수부분은 그대로 소수점은 반올림, (정수+점+소수점 총 자리수)
		System.out.printf("%8.2f\n", 123.23);
		System.out.printf("%4.2f\n", 123.23);
		System.out.printf("%5.1f\n", 123.23);
		System.out.printf("%5.1f\n", 123.75);
		System.out.println("");
		// %e는 실수(지수형식),%f 실수, %x는 10진수를 16진수로 표현
		System.out.printf("%e\n", 12345.0e-3);

		System.out.printf("%d %c .0%f %e %x\n", 22, 'a', 24.5, 24.5, 24);
		System.out.printf("%d %#x %#X\n", 27, 27, 27);
		System.out.printf("%d %x %X\n", 27, 27, 27);

		System.out.printf("%s\n", "Seoul korea");
		System.out.printf("%S\n", "Seoul korea");
		System.out.printf("%6.5s\n", "Seoul korea");
		// # 자리수 표현 ,%s는 string출력, %S는 대문자로 변형 출력, %전체자리수.자리수s 자리수 문자열출력

		System.out.printf("%c %c %c %c %c\n", 'a', 'b', 'a', 'b', 'a');
		System.out.printf("%1$c %2$c %1$c %1$c %2$c\n", 'a', 'b');
	}
}