package hw4;

public class NewFeb {

//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)公元年份為4的倍數但非100的倍數，為366天閏年。
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

	// 月份
	int[] feb = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 總和
	int sum = 0;

	public void f(int[] three) {

		if (three[1] == 2 && three[2] > 29) {

			System.out.println("沒有這個日期,掰掰");

			return;
		}

		if (three[0] % 4 == 0 && three[0] % 100 != 0) { // 閨年

			feb[2] = 29; // 二月29天

			for (int j = 0; j < three[1]; j++) {

				sum += feb[j];
			}

		} else {

			for (int j = 0; j < three[1]; j++) { // 計算月份(跑到我輸入的月份)

				sum += feb[j]; // 月份加總
			}

		}
		sum += three[2]; // 日期 加
		System.out.print("輸入的日期為該年第 " + sum + " 天");
	}
}
