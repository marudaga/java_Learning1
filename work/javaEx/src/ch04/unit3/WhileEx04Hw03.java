package ch04.unit3;

//반복문while20기본문제3
public class WhileEx04Hw03 {

	public static void main(String[] args) {
		// A-Z까ㅈ의 영문자를 한줄에 5개씩 출력
		char c;
		int i=1;
		c=65;
		while(c>='A'&&c<='Z') {
			System.out.printf("%c ",c);
			if(i%5==0) {
				System.out.print("\n");
			}
			i++;
			c++;
		}
	}
}