package ch04.unit3;

//반복문while20기본문제8
public class WhileEx04Hw08 {

	public static void main(String[] args) {
		// 1+2+4++ 20번째 항까지의 합
		int s,i,total;
		i=0;s=1;total=0;
		while(i<20)	{
			s+=i;
			total+=s;
			i++;
		}
		System.out.printf("결과  : %d",total);
	}
}