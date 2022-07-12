package ch04.unit3;

public class ForQuiz01 {

	public static void main(String[] args) {
		int start = 200000000;
		int count = 0;
		
		for(float f = start; f< start +50; f++) {
			//float는 2000000050  가20000000000로 저장 정밀도 낮아서
			//float형은  for문의 반복 횟수로 사용하면 안됨
			count++;
		}
		//double이나 float 형은 관계연산자로 사용하면 정확도 문제로 답이 달라짐
		double a=0;
		a+=4.8;
		a+=0.4;
		System.out.println(a==5.1);//false로 뜸 정확도문제
		System.out.println(count);
	}
}
