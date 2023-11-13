package hw10;

import java.util.Scanner;

//請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
//(1)千分位(2)百分比(3)科學記號，
//而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API文件, 
//判斷數字可用正規表示法)

public class ScMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字:");
		while (true) {
			if (sc.hasNextInt()) {
				int s1 = sc.nextInt();
				System.out.println(s1);
				break;
			} else {
				System.out.println("數字格式不正確,請重新輸入");
				sc.next();
			}
		}
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
		int s2 = sc.nextInt();

		switch (s2) {

		case 1:

		case 2:

		case 3:
		}

		sc.close();
	}

}
