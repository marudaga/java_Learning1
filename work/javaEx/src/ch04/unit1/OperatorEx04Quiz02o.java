package ch04.unit1;

import java.util.Scanner;

public class OperatorEx04Quiz02o {

	public static void main(String[] args) {
		//점수를 입력받아 입력 받은 점수에 따른 평점을 구하는 프로그램
		Scanner sc= new Scanner(System.in);
		int score;
		double m;
		System.out.println("점수 ? ");
		score=sc.nextInt();
				if(score==100) {
					m=4.5;
					System.out.printf("점수 :%d, 평점 :%.1f",score,m);
				}else if(score<100&&score>=60)
				{
					m=score/20.0;
					//double/float하면 어떻게 됨
					System.out.printf("점수 :%d, 평점 :%.1f",score,m);
				}else if(score>0 && score<60)
				{
					System.out.printf("점수 :%d, 평점 : 0.0",score);
				}else {
					System.out.print("0과 100점 사이의 점수를 입력하세요");
				}		
				sc.close();
				
	}

//	if(score>=&&socre<=100) {
//		if(score>=95) {}
//		else if(score>90) {}
//		else if (socre>85) {}
//if 문에서 위의 조건을 다시 적을 필요가 없다ex. score>85&&score<90
	
}
