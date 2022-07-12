package ch04.unit3;


//반복문while20기본문제7
public class WhileEx04Hw07 {

	public static void main(String[] args) {
		// x는 100부터 시작 1초마다2증가 y는 0부터 1초마다 5증가 
		//몇초후에 y가 x를  따라잡는지와 그때의 x,y값
		int x,y,t;
		x=100;
		y=0;t=0;
		while(y<x) {
			t++;
			x=100+2*t;
			y=5*t;
		}
		System.out.printf("x: %d,y : %d",x,y);	
		System.out.printf("걸린시간 :%d초 ",t);	

	}
}