package ch02;

public class VariableEx {

	public static void main(String[] args) {
		int a=35;//10진수
		int b=035;//8진수
		int c=0x35;//16진수
		int d =0b101;//2진수
		long e =35L;//Long 형
		int f =1_0_1;//
		
		System.out.println(a+","+b+","+c+","+d+","+e+","+f);
		//에러예시 a=0b201; ,a=087 0b2진수 2가 error 087는8진수라 잘못된수
	}

}
