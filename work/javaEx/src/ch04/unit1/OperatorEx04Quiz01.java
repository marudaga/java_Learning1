package ch04.unit1;

import java.util.Scanner;

public class OperatorEx04Quiz01 {

	public static void main(String[] args) {
		//두정수를 입력받아 수중 큰수를 적은 수를 뺀 차이를 출력
		Scanner sc= new Scanner(System.in);
		int a=0,b=0,c;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("첫번째수 ? ");
		System.out.println("두번째수 ? ");
				if(a>=b)
				{
					c=a-b;
					System.out.printf("두수의 차이  :  %d", a-b);
				}else
				{
					System.out.printf("두수의 차이  :  %d", b-a);
				}
	}

}
