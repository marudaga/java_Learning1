package ch03.unit3;

public class OperatorEx02 {

	public static void main(String[] args) {
		// 비트단위 연산
		int a;
		a=13;
		String s;
		
		s=(a&1)==0?"짝수":"홀수";
		
		System.out.println(s);
	}

}
