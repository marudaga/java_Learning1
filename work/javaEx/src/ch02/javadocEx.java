package ch02;

public class javadocEx {
	/* 주석에 문서화 주석도있다.
	 *  
	 * 짝수인지 판별하는 메소드 
	 * @param num  짝수인지 판별할 수 <code>int</code>
	 * @return		짝수 여부를 반환한다. <code>boolean</code>
	 * -cmd =>javadoc -use 클래스.java -d doc 
	 * */
	public boolean isEven(int num) {
		return num %2 ==0;
	}
	public static void main(String[] args) {
		
	}

}
