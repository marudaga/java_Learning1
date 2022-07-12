package ch03.unit2;

public class OperatorEx04x {

	public static void main(String[] args) {
		int a,b;
		boolean c;
		 a=20;b=20;
		 c= ++a>++b&& ++b>20;
		 System.out.println(a+","+b+","+c);

		 a=20;b=20;
		 c= a++>20&& ++b>20;
		 System.out.println(a+","+b+","+c);

		 a=20;b=20;
		 c= ++a>20&& b++>20;
		 System.out.println(a+","+b+","+c);
		 
	}

}
