package hw1;

public class Work1 {

	public static void main(String[] args) {
//		1.請設計一隻Java程式,計算12,6這兩個數值的和與積

		int i1 = 12, i2 = 6;
		for (int i = 0; i < 1; i++) {
			System.out.println("和: " + (i1 + i2));
			System.out.println("積: " + (i1 * i2));
		}

//		2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

		int egg = 200; // 蛋
		int egg12 = egg / 12; // 打
		int egg1 = egg % 12; // 顆
		System.out.println(egg12 + "打" + egg1 + "顆");

//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int allsec = 256559;
		int sec = allsec % 60;
		int min = (allsec / 60) % 60;
		int hr = (allsec / 3600) % 24;
		int day = allsec / 86400;

		System.out.println(day + "天" + hr + "小時" + min + "分" + sec + "秒");

//		4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//半徑 x 半徑 x 3.1415    半徑 x 2 x 3.1415	
		final float sum = 3.1415f; // 圓周率
		int a = 5; // 半徑
		float b = a * a * sum; // 圓面積
		float c = a * 2 * sum; // 圓周長
		System.out.println("圓面積: " + b);
		System.out.println("圓周長: " + c);

//		5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)	
//本利和 = 1500000 x (1 + 0.02)n次方	

		int money = 1500000;
		double r = 0.02;
		double z = (1 + r);
		for (int x = 1; x <= 10; x++)
			z *= (1 + r);
		double allmoney = money * z;
		System.out.println((int) allmoney + "元");

//		6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因

		System.out.println(5 + 5); // 數值相加
		System.out.println(5 + '5'); // 數值 + char = 數值,'5'轉成數值 = 53
		System.out.println(5 + "5"); // 數值串接String

	}
}