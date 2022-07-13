package ch04.unit7;


public class ForHw2 {

	public static void main(String[] args) {
		// 3x+6y=27

		for(int x=0;x>=10;x++)
		{
			for(int y=0;y>=10;y++) {
				if(3 *x+6*y==27) {
					System.out.printf("[ %d,%d ] \n",x,y);
				}
			}
		
		}
		
	}
}