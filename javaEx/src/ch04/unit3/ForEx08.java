package ch04.unit3;

public class ForEx08 {


	public static void main(String[] args) {
		for(int i=1;i<=3; i++) {
			System.out.println("i:"+i);
			
			for(int j=1;j<=i; j++) {
				System.out.println("i:"+i+", j:"+j);
			}
			
			System.out.println("-------");
		}
	}
}
