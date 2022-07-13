package ch03.unit3;

public class OperatorEx01o {

	public static void main(String[] args) {
		// 비트단위 연산 &(and), |(or) ,^(xor)서로 다르면 참
		int a,b,c;
		a=12;
		c =~a;
		System.out.println("~12 : "+ c);//~12 : -13
		
		a=12;
		b=6;
		System.out.println("12&6 : " + (a & b));//12&6 : 4
		System.out.println("12|6 : " + (a | b));//12|6 : 14
		System.out.println("12^6 : " + (a ^ b));//12^6 : 10
	}

}
