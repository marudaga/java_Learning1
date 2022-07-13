package ch04.unit3;


public class WhileEx04my3 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+ .. (1+2+..9+10) 의 결과출력
		
		int sum, n,total;
		
		System.out.print("1+(1+2)+(1+2+3)+ .. (1+2+..9+10) ? \n");
		
		n=0;
		sum=0;
		total=0;
		while(n<10) {
			n++;
			sum =sum+n;
			total +=sum;
		}
		System.out.printf("%d\n",total);
	}
}
