package ch04.unit3;

//초기값 설정  for(초기값;조건식;증감식) for(;;)실행됨   
//초기식은 1번실행=>  [초기식=>조건식(참)=>실행문] =>[증감식=>조건식(참)=>실행문]
public class ForEx01o {

	public static void main(String[] args) {
		// 무한루프
		for(int n=1;n<=10;n++) {// for문안에서 변수선언=> for문안에서만 가능
			System.out.print(n+"\t");
			
		}
		System.out.println();
		
	}

}
