package ch04.unit1;

import java.util.Scanner;

public class OperatorEx04Quiz03 {

	public static void main(String[] args) {
		//하루 일한 시간을 입력받아 급여를 계산하는 프로그램
		Scanner sc= new Scanner(System.in);
		int dayTime,Cost;
		System.out.println("급여시간 ? ");
		dayTime=sc.nextInt();
		
		if(dayTime>8)
		{
			Cost=dayTime*10000+(dayTime-8)*15000;
		}else
		{
			Cost=dayTime*10000;
		}
		System.out.printf("급여 : %d\n",Cost);
		sc.close();
	}

}
