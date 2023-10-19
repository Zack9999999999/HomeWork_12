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

//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("請輸入三個數字:");
//
//		int[] x = new int[3];
//
//		for (int i = 0; i < 3; i++) {
//			x[i] = sc1.nextInt();
//		}
//		Arrays.sort(x);
//		if (x[0] == x[1] && x[1] == x[2]) {
//			System.out.println("正三角形");
//		} else if (x[0] == x[1] && x[2] > x[1]) {
//			System.out.println("等腰三角形");
//		} else if (x[0] < x[1] && x[1] < x[2]) {
//			System.out.println("其他三角形");
//		} else if (x[0] * x[0] + x[1] * x[1] == x[2] * x[2]) {
//			System.out.println("直角三角形");
//		} else
//			System.out.println("不是三角形");

//================================================================================

//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//
//		(提示:Scanner,亂數方法,無窮迴圈)
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

//		Scanner sc2 = new Scanner(System.in);
//
//		System.out.println("開始猜數字吧!");
//
//		while (true) {
//
//			int number = (int) (Math.random() * 10);
//
//			int i = sc2.nextInt();
//
//			if (i == number) {
//				System.out.println("答對了! 答案就是 " + i);
//				break;
//			} else
//				System.out.println("猜錯囉");
//		}

//      進階		
//		int number = (int)(Math.random() * 101);
//		
//		while(true) {
//	
//			int i = sc2.nextInt();
//			
//			if(i == number){
//				System.out.println("答對了! 答案就是 " + i);
//				break;
//			}else if(i < number) {
//				System.out.println("小於正確答案");
//			}else {
//				System.out.println("大於正確答案");
//			}
//		}

//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

		Scanner sc3 = new Scanner(System.in);

		System.out.println("阿文請輸入你討厭哪個數字?");

		int number = sc3.nextInt();
		for (int x = 1; x <= 49; x++) {
			if (x == number) {
				continue;
			} else
				System.out.print(x + "\t");
		}
	}
}
