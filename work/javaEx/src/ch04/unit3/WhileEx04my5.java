package ch04.unit3;



public class WhileEx04my5 {

	public static void main(String[] args) {
		//
		int n,s;
		 n=s=0;
		 while(n<100) {
			 n++;
			 s+=n;
			 if(n%10==0) {
			 System.out.println("1~" +n+"까지 합 : " +s);
			 }
		 }
	}
}