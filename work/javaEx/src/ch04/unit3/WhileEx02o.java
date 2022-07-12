package ch04.unit3;


public class WhileEx02o {
// 문자도 while문으로 출력가능 ++은 while문에 넣지 않기 bool연산에 =넣지않고 ==만 넣자 헷갈림
	public static void main(String[] args) {
		/*char c;
		
		c='A';// c=65<=> c='A'
		while(c<='Z') {
			System.out.print(c + " ");;
			c++;
		}
		System.out.println();
		*/

		int n=0;
		char c;
		c = 'A';
		while(c<'Z') {
			System.out.print(c + "\t");
			n++;
			if(n%7 == 0) {
				System.out.println();
			}
			c++;
		}
		System.out.println();
		
	}
}