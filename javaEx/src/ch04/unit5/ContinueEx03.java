package ch04.unit5;

// 잘못 입력되어 실행된 내용을 되돌릴 때 i--
//label => 중복 루프 벗어나기
//label: + 사용되어야함 ex. break label; \\ continue label;
public class ContinueEx03 {
	public static void main(String[] args) {
		//일반 break;
//		i:1, j:1
//		i:1, j:2
//		i:2, j:1
//		i:2, j:3
//		i:3, j:2
//		i:3, j:3
		// break jump;
//		i:1, j:1
//		i:1, j:2
//		i:2, j:1
		jump:
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i+j==4) {
					continue jump;
				} 
				System.out.println("i:"+i+", j:"+j);
			}
		}
	}
}
