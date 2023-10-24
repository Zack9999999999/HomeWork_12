package hw4;

public class NewFeb {

//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)公元年份為4的倍數但非100的倍數，為366天閏年。
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
	
	//月份
	final int[] FEB = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//總和
	int sum = 0; 
	
	public void f(int[] three) {
		
		for(int i = 1; i < FEB.length; i++) {
			
			if(three[i] == FEB[i])
			
			
			
			System.out.print(FEB[i]);

		}
		
	}
}
