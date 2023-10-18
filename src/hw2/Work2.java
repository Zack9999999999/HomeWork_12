package hw2;
public class Work2 {

	public static void main(String[] args) {

//		1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

//		int y = 0;
//		for(int x = 2; x <= 1000; x++) {
//			if(x % 2 == 0) {
//				y += x;
//			}
//		}
//		System.out.println(y);
//-----------------------------------------------------------------------------------		
//		int y = 0;
//		for(int x = 0; x <= 1000; x = x + 2)
//			y += x;
//		System.out.println(y);
//-----------------------------------------------------------------------------------
//GPT	int y = 0, x = 2;
//        while (x <= 1000) {
//            y += x;
//            x += 2;
//        }
//        System.out.println(y);

		
//		2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

//		int y = 1;
//		
//		for(int x = 2; x <= 10; x++) {
//			y *= x;
//		}
//		System.out.println(y);
		
		
//		3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

//		int x = 0, y = 0;
//		while(x <= 10) {
//			x++;
//			y = x * x;
//		}
//		System.out.println(y);
		
		
//		4.請設計一隻Java程式,輸出結果為以下:
//		  1 4 9 16 25 36 49 64 81 100

//		int y = 0;
//		for(int x = 1; x <= 20 ; x++) {
//			if(x % 2 == 1) {
//				y += x;
//			continue;
//			}
//				
//				System.out.print(y + " ");
//		}
//-----------------------------------------------------------------------------------		
//		int x = 1, y = 3;
//		
//		while(x <= 100) {
//			System.out.print(x + " ");
//			x += y;
//			y += 2;
//		}
		
				
//		5.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		  輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
			//4 14 24 34 40~49

//		int y = 0;
//		for(int x = 1; x <= 39; x++) {
//			if(x % 1 == 4 || x % 10 == 4 || x % 20 == 4 || x % 30 == 4) {
//				continue;
//			}
//			y++;
//			System.out.print(x + " ");
//		}
//		System.out.print("\n" + y + "個");

		
//		6.請設計一隻Java程式,輸出結果為以下:
//		  1 2 3 4 5 6 7 8 9 10
//		  1 2 3 4 5 6 7 8 9
//		  1 2 3 4 5 6 7 8
//		  1 2 3 4 5 6 7
//		  1 2 3 4 5 6
//		  1 2 3 4 5
//		  1 2 3 4
//		  1 2 3
//		  1 2
//		  1
		
//		int x = 10;
//		while(x >= 1) {
//			for(int y = 1; y <= x; y++) {
//				System.out.print(y + " ");
//			}
//			x--;
//			System.out.println();
//		}
//-----------------------------------------------------------------------------------		
		//out:
//		for(int x = 10; x >= 1; x--) {
//			for(int y = 1; y <= x; y++) {
//				System.out.print(y + " ");
				//if(x == 1)
					//break out;
//			}
//			System.out.println();
//		}
		
		
//		7.請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		
//		int z = 1;
//		for(int x = 65; x <= 70; x++) {
//			for(int y = 1; y <= z; y++) {
//				System.out.print((char)x);
//			}
//			z++;
//			System.out.println();
//		}
		
	}

}
