package ch04.unit7;

import java.util.Scanner;

public class ForHw1 {

	public static void main(String[] args) {
		// 5개의 정수를 입력받은 정수 중 7에 가까운 수 출력
		Scanner sc= new Scanner(System.in);	
		System.out.print("5개 정수 입력");
		int n,diff,min,result;
		result=0;
		min=0;
		for(int i=0;i<5;i++){
			n=sc.nextInt();
			diff = n>7? n-7:7-n;
			if(i==0||min>diff) {
				min= diff;
				result=n;
			}
			// 첫번째 경우 제외 조건식은 ||로 연결가능
		}
		System.out.println("가장 가까운 수 :" + result);
		sc.close();
	}
}
