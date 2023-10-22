package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
//		5 5 5 正三角形	5 8 5 等腰三角形	5 6 7 其他三角形	0 0 0 不是三角形
//		(提示:Scanner,"三角形成立條件",判斷式if else)
//		(進階功能:加入直角三角形的判斷)
//		a平方 +b平方 =c平方

		Scanner sc = new Scanner(System.in);

//		Triangle tri = new Triangle();
//
//		System.out.println("請輸入三個數字:");

//1.int[] x 將tri.getThree內得到的陣列儲存起來		
//		int[] x = tri.getThree();

//2.將int[] x帶入runThreeTime方法內做執行		
//		tri.setThreeTime(x);

//================================================================================

//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//
//		(提示:Scanner,亂數方法,無窮迴圈)
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

//		System.out.println("開始猜數字吧!");
//
//		while (true) {
//
//			int number = (int) (Math.random() * 10);
//
//			int i = sc.nextInt();
//
//			if (i == number) {
//				System.out.println("答對了! 答案就是 " + i);
//				break;
//			} else
//				System.out.println("猜錯囉");
//		}

//      進階		
//		int number = (int) (Math.random() * 101);
//
//		while (true) {
//
//			int i = sc.nextInt();
//
//			if (i == number) {
//				System.out.println("答對了! 答案就是 " + i);
//				break;
//			} else if (i < number) {
//				System.out.println("小於正確答案");
//			} else {
//				System.out.println("大於正確答案");
//			}
//		}

//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

		System.out.println("阿文請輸入你討厭哪個數字?");

//		int number1 = sc.nextInt();
//		
//		int count = 0;
//		
//		for (int q = 1; q <= 49; q++) {
//			if (q % 10 == number1 || q / 10 % 10 == number1) {
//				continue;
//			} else {
//				System.out.print(q + " ");
//				count++;
//			}
//		}
//					
//		System.out.println("\n" + "總共有" + count + "數字可選");

//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

		int[] x = new int[49];
		int count = 0;
		int number = sc.nextInt();

		for (int i = 1; i <= 49; i++) {
			if (i % 10 == number || i / 10 % 10 == number) {
				continue;
			} else {
				x[count] = i;
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("\n" + "總共有" + count + "數字可選");
		
		//複製x陣列(用途是把多餘的空元素清理掉 使新陣列長度 = count)
		int[] newX = Arrays.copyOf(x, count);
					
		//用來存x陣列取出的6個亂數
		int[] sixNumber = new int[6];	

		for (int i = 0; i <= 5;) {
			// rand = 0 ~ count 亂數
			int rand = (int) (Math.random() * count);
			
			//將x陣列亂數存入
			sixNumber[i] = newX[rand];
			
			// 哪個陣列, 從索引0, ~ 索引count, 搜有沒有x[rand]值
			int noNumber = Arrays.binarySearch(sixNumber, 0, i, newX[rand]);

			// 負數等於沒搜到(沒有重複值)
			if (noNumber < 0) {
				System.out.print(sixNumber[i] + " ");
				i++;
			}
		}
	}
}