package ch04.unit3;

//초기값 설정  for(초기값;조건식;증감식) for(;;)실행됨   
//초기식은 1번실행=>  [초기식=>조건식(참)=>실행문] =>[증감식=>조건식(참)=>실행문]
public class ForEx04 {

	public static void main(String[] args) {
		// 
		int n;
		for(n=2;n<=10;n+=2) {// 짝술ex.(n=10;n>=1;n--)
			System.out.print(n+" ");
		}
		System.out.print("\n밖:"+n);
	}
}
