package hw4;

public class February29 {

private int day = 30;
	
	public void setFeb(int[] three) {
				
		if(three[1] == 2) {
			if (three[2] > 29) {
				System.out.println("沒有這個日期");
				return;
			}
			day += 1 + three[2];
		}else if(three[1] == 3) {
			day += 1 + 29 + three[2];
		}else if(three[1] == 4) {
			day += + 1 + 29 + 31 + three[2];
		}else if(three[1] == 5) {
			day += + 1 + 29 + 31 + 30 + three[2];
		}else if(three[1] == 6) {
			day += + 1 + 29 + 31 + 30 + 31 + three[2];
		}else if(three[1] == 7) {
			day += + 1 + 29 + 31 + 30 + 31 + 30 + three[2];
		}else if(three[1] == 8) {
			day += + 1 + 29 + 31 + 30 + 31 + 30 + 31 + three[2];
		}else if(three[1] == 9) {
			day += + 1 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + three[2];
		}else if(three[1] == 10) {
			day += + 1 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + three[2];
		}else if(three[1] == 11) {
			day += + 1 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + three[2];
		}else if(three[1] == 12) {
			day +=  + 1 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + three[2];
		}
		
		System.out.println("輸入的日期為該年第: " + day + "天");
	}
}
