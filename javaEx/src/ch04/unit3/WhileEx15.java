package ch04.unit3;


public class WhileEx15 {
	public static void main(String[] args) {
		// 무한루프
		int n,s;
		 s=n=0;
		 while(true) {//java 에서는 true말고 1은 안됨
			 n++;
			 s+=n;
			 if(n>=10) {
				 break;
			}
		}
		 System.out.println("결과:"+s);
		 
	}

}
