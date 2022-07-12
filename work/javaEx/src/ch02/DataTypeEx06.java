package ch02;

/*
    byte < short < int < long < float < double
           char  < int < long < float < double
 */
public class DataTypeEx06 {

	public static void main(String[] args) {
		float f; // 단정도형
		
		f = 10; // int 리터널을 float 자료형에 대입
		System.out.println(f); // 10.0
		
		// f = 0.5; // 컴파일오류.
			// 0.5 : 배정도형 리터널로 float에 대입 불가

		f = 0.5f; // 0.5f : 단정도형 리터널
		System.out.println(f);
		
		f = 1.2e04f;
		System.out.println(f);
		
		f = 'A';
		System.out.println(f); // 65.0
		
		
		double d; // 배정도형
		d = 0.5;
		System.out.println(d);
		
		d = 10.5d;
		System.out.println(d);
		
		// f = d; // 컴파일오류. double > float
		f = (float)d; // double를 float로 강제 형변환
		System.out.println(f);
				
	}
}
