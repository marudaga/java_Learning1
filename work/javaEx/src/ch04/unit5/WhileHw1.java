package ch04.unit5;

public class WhileHw1 {

	public static void main(String[] args) {
		//1-2+3-4
		int n, s=0;
		n=0;
		
		while(s<100) {
			n++;
			if(n%2==0) {
				s+=-n;
			}else {
				s+=n;
			}
				
		}
		System.out.print("n : "+n+"\n");
		System.out.print("s : " + s);
	}
}