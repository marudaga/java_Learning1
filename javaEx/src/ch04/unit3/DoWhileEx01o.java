package ch04.unit3;
//hw->6,7,10 변경
//terminate all    실행중인 창 삭제 
//main ctrl+space =>publie static void main()
public class DoWhileEx01o {
//while 은 조건안의 내용만 실행 do while 문은 do 를 무조건 한번 실햏
	public static void main(String[] args) {
		
//		int n=10;
//		while(n<10) {//처음조건이 만족하지 않지만 같은 내용을 코딩할 때
//			n++;
//			System.out.println("안:"+n);
//		}
//		System.out.println("밖:"+n);
		
		int n=10;
		do {
			n++;
		System.out.println("안:"+n);
		}while(n<10);
		System.out.println("밖:"+n);
	}

}
