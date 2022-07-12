package ch04.unit3;
public class WhileHw1 {

	public static void main(String[] args) {
		int a=1,s=0;
		 while(s<100) {
			 
			 if(a>0) {
				 a=-(a+1);
			 }else {
				 a=-a+1;
			 }
			 s+=a;
		 }
		 System.out.print("n:"+s);
		 System.out.print("s:"+a);
	}
}


