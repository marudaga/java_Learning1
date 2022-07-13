package ch02;

public class DataTypeEx02 {

	public static void main(String[] args) {

		byte a, b = 10;
		a = -15;
		System.out.println(a + "," + b);

		a = (byte)130;
		System.out.println(a);
		
		short s1,s2=100;
		
		s1 = 'A';
		System.out.println(s1+","+s2);
		
		int i1,i2,i3;
		i1 = 200;
		i2 = 'a';
		i3 = '1' +'3';
		System.out.println(i1+","+i2+","+i3);
	}
}
