package ch04.unit3;

public class WhileEx04my7o {

	public static void main(String[] args) {
		//1~ 100까지 수 중에서 3또는 4의 배수를 제외한 수를 한 줄에 5개씩 출력
		int n, i;
		n=0
				; i=0;
		while(n<100) {
			if(n%3!=0&&n%4!=0) 
			{
				System.out.print(n +"\t");
				i++;
			}
			n++;
			if(i%5==0) {
				System.out.print("\n");
			}
		}
	}
}