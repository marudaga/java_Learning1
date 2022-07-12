package ch04.unit3;

public class WhileEx04my6 {

	public static void main(String[] args) {
		//1/2 + 2/3 + 3/4 .. 9/10의 결과는 ?
		int a;
		double d;
		a=0;
		d=0.0;
		while(a<9) {
		a++;
		d+=(double)a/(a+1);
		
		}
		System.out.print(d);
	}
}