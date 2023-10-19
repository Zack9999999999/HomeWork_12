package hw2;

public class TestNineNine {

	public static void main(String[] args) {

//		1.for while
		
//		int y = 1;
//		while(y <= 9) {
//		for(int x = 2; x <= 9; x++) {
//			System.out.print(x +"x" + y + " = " + x * y + " ");
//			}
//			y++;
//			System.out.print('\n');
//		}
		
//		2.for do while
		
//		int y = 0;
//		do {
//			y++;
//			for(int x = 2; x <= 9; x++) {
//				System.out.print(x + " x " + y + " = " + x * y + " ");
//			}
//			System.out.print('\n');
//		}while(y < 9);
		
//		3.while do while
		
		int x = 1;

		while(x < 9 ) {
			int y = 1;
			x++;
			do {
				System.out.print(x +"x" + y + " = " + x * y + " ");
				y++;

			}	while(y <= 9);
			System.out.println();
		}

	}

}
