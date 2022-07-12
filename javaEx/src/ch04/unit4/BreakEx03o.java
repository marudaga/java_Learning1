package ch04.unit4;

//break : while, do~while, for, switch ~ case 에서 사용
//		:제어문을 빠져 나옴
public class BreakEx03o {
	public static void main(String[] args) {
		//label gogo로 완전 루프 break 와 첫 for문 break한 경우
	
		//그냥 break한 경우
//		i:1, j:1
//		i:1, j:2
//		i:2, j:1
		//gogo로 완전 루프 break
//		i:1, j:1
//		i:1, j:2
		//아래 두 경우 동일
//		gogo:
//		for()
		
//gogo:
//		for()

		
		gogo:
		for(int i=1; i<=3;i++) {
			for(int j=1; j<=3;j++) {
				if(i+j == 4) {
					break gogo;
				}
				System.out.println("i:"+i+", j:"+j);
			}
		}
		
		
	}
}
