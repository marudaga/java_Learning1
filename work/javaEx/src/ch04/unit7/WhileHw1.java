package ch04.unit7;

public class WhileHw1 {

	public static void main(String[] args) {
		//1-2+3-4..에서 연산 결과가 100 이상이 되는 최소의 n
		//변수몇개->
		int n, s=0;
		n=0;
		
		while(s<100) {
			n++;
			if(n%2==0) {
				s+=-n;
			}else {
				s+=n;
			}//a일때 맞으면 b아니면 c => a?b:c
		}
		System.out.print("n : "+n+"\n");
		System.out.print("s : " + s);
	}
}