package ch03.unit6;

public class OperatorEx02o {

	public static void main(String[] args) {
		//typecasting 강제형변환
		byte a;
		char b,c;
		
		a= 'A' + 10;//리터널은 형변환이 되지 않는다.
		System.out.println(a);
		
		b = 'A';
		//c=b+10; 컴파일 오류 변수로 연산은 형변환됨
//		a= b + 10;
//		System.out.println(c);

	}
	

}
