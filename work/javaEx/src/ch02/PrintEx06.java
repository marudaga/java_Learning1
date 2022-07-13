package ch02;

public class PrintEx06 {

	public static void main(String[] args) {
		System.out.printf("%d %d", 10,10);

		System.out.println("printf() method");
		System.out.printf("%d\n", 12345);
		System.out.printf("%d\n",-12345);
		System.out.printf("%d\n", 12345);
		//마이너스 표현됨
		System.out.printf("%d\n", 123400000000L);
		//long형 변환
		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123);//10자리수
		System.out.printf("%010d\n",123);//10칸인데 앞으로 0으로 채운다.
		System.out.printf("%-10d\n",123);//10칸인데 뒤로 공백을 넣는다
		System.out.printf("%2d\n",123);//자리수 부족하면 자리수 무시하고 출력
		System.out.println("-------------------------");
		
		System.out.printf("%d\n",123);
		System.out.printf("%d\n",-123);//unsigned
		System.out.printf("%+d\n",123);//%+d는 signed 
		System.out.printf("%+d\n",-123);
		System.out.printf("%(d\n",123);//값을 ()로 묶는다.
		System.out.printf("%(d\n",-123);
		
		// 문자 출력 : %c
		// 'A' : 문자  char 자료값 
		//"A", "AB" : 문자열(자료값이 아닌 class)
		System.out.printf("%c\n",'A');
		//System.out.printf("%c\n","A");
		//%c로 문자열 서식x
		System.out.printf("%c\n",65);
		System.out.printf("%c\n",121);
		//문자에 표시되는 값은 아스키 코드값
		System.out.printf("%c\n",'A');
	}

}
