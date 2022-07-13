package ch03.unit1;

public class OreratorEx07o {

	public static void main(String[] args) {
		int a;
		
		a=12356;
		
		a= a/10*10;
		System.out.println(a);//자리수 버리기
		
		a=12356;
		a= (a+5)/10*10;
		System.out.println(a);
		
		double b=126.456;
		System.out.printf("%.2f\n",b);//126.46  .%.2f 반올림
		b=(int)(b*100)/100.;//버림
		System.out.printf("%.3f\n",b);
	}
}
