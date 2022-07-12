package ch02;

public class StringEx {

	public static void main(String[] args) {
		//String 문자열클래스
		String s1 = "seoul";
		String s2;
		int a1;
		s2 = s1+"korea";//문자열+문자열=>문자열결합
		System.out.println(s2);
		
		s2 ="";//문자열은 공백에러없음
		System.out.println(s2);
		
		a1 ='X' + 'A' +10;// 문자열+일반자료형=>문자열
		System.out.println(a1);
		
		s2 = 'A' + 10 +"X";
		System.out.println(s2);
		
		int a;
		 a= 'A' +'0';
		 System.out.println(a);
		 //문자열 ""두개 ''는 다름
	}

}
